<%--
  Created by IntelliJ IDEA.
  User: maill
  Date: 2018/7/23
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>layout 后台大布局 - Layui</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/layui/css/layui.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/global.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/icheck/minimal/red.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">layui 后台布局</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    贤心
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">退了</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree" lay-filter="test">
                <li class="layui-nav-item"><a class="layui-this"
                                              href="${pageContext.request.contextPath}/index">管理系统</a></li>

                <li class="layui-nav-item">
                    <a href="javascript:;">用户管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="${pageContext.request.contextPath}/users">用户列表</a></dd>
                    </dl>
                </li>

                <li class="layui-nav-item">
                    <a href="javascript:;">商品管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="${pageContext.request.contextPath}/products">商品列表</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">订单管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="${pageContext.request.contextPath}/orders">订单列表</a></dd>
                    </dl>
                </li>

            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">
            <fieldset class="layui-elem-field">
                <legend>订单管理 - 订单列表</legend>
                <div class="layui-field-box">
                    <form class="layui-form layui-col-md12 we-search" onsubmit="return false;" id="formDemo">
                        <div class="layui-inline">
                            <input class="layui-input" placeholder="开始日" type="date" name="startTime" id="startTime" autocomplete="off">
                        </div>
                        <div class="layui-inline">
                            <input class="layui-input" placeholder="截止日" type="date" name="endTime" id="endTime" autocomplete="off">
                        </div>
                        <div class="layui-input-inline">
                            <select name="state" id="state">
                                <option value="0">支付状态</option>
                                <option value="1">未付款</option>
                                <option value="2">已付款</option>
                                <option value="3">未发货</option>
                                <option value="4">已发货</option>
                            </select>
                        </div>
                        <div class="layui-inline">
                            <input type="text" name="oid" id="oid" placeholder="请输入订单号" autocomplete="off"
                                   class="layui-input">
                        </div>
                        <button class="layui-btn" lay-submit="" lay-filter="sreach" data-type="reload"><i
                                class="layui-icon">&#xe615;</i></button>
                        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                    </form>
                    <hr>
                        <div class="weadmin-block demoTable">
                            <button class="layui-btn layui-btn-danger" data-type="getCheckData"><i class="layui-icon"></i>批量删除</button>
                            <%--<button class="layui-btn" onclick="WeAdminShow('添加订单','./add')"><i class="layui-icon"></i>添加</button>--%>
                        </div>
                    <hr>
                    <table class="layui-table" id="orderList">
                    </table>


                </div>
            </fieldset>
        </div>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © 千峰版权所有
    </div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/javascript/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.all.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/icheck/icheck.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/javascript/dw.js"></script>
<script type="text/javascript">

    //改变时间格式
    function Format(datetime,fmt) {
        if (parseInt(datetime)==datetime) {
            if (datetime.length==10) {
                datetime=parseInt(datetime)*1000;
            } else if(datetime.length==13) {
                datetime=parseInt(datetime);
            }
        }
        datetime=new Date(datetime);
        var o = {
            "M+" : datetime.getMonth()+1,                 //月份
            "d+" : datetime.getDate(),                    //日
            "h+" : datetime.getHours(),                   //小时
            "m+" : datetime.getMinutes(),                 //分
            "s+" : datetime.getSeconds(),                 //秒
            "q+" : Math.floor((datetime.getMonth()+3)/3), //季度
            "S"  : datetime.getMilliseconds()             //毫秒
        };
        if(/(y+)/.test(fmt))
            fmt=fmt.replace(RegExp.$1, (datetime.getFullYear()+"").substr(4 - RegExp.$1.length));
        for(var k in o)
            if(new RegExp("("+ k +")").test(fmt))
                fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
        return fmt;
    }

    //业务实现
    layui.use(['table', 'layer', 'jquery'], function () {
        var table = layui.table;
        table.render({

            page: true,
            elem: '#orderList',

            url: '${pageContext.request.contextPath}/admin/orders/getOrders',
            cols: [[
                {type:'checkbox'},
                {field: 'oid', title: '订单编号',sort:true,width:100},
                {field: 'ordertime', title: '下单时间',width: 120,templet:'<div>{{ Format(d.ordertime,"yyyy-MM-dd")}}</div>'},
                {field: 'total', title: '订单总额'},
                {field: 'state', title: '订单状态',width:150},
                {field: 'uname', title: '姓名'},
                {field: 'uaddress', title: '地址'},
                {field: 'uphone', title: '电话'},
                {field: 'oid',field: 'state', title: '操作', templet: '#operateTpl',width:224}
            ]],
            done:function (res,curr,count) {
                $("[data-field='state']").children().each(function () {
                    if ($(this).text()=="1"){
                        $(this).text('未付款');
                    }
                    if ($(this).text()=="2"){
                        $(this).text('已付款');
                    }
                    if ($(this).text()=="3"){
                        $(this).text('未发货');
                    }
                    if ($(this).text()=="4"){
                        $(this).text('已发货');
                    }
                });
            }
        });

        //搜索按钮的点击事件
        $('.layui-body .layui-btn').click(function () {
            var type = $(this).data("type");//reload
            active[type] ? active[type].call(this) : '';
        });

        //批量删除
        $(".demoTable .layui-btn-danger").click(function () {
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
            console.log(type)
        });

        var active = {

            //批量删除
            getCheckData:function () {
                var data = table.checkStatus("orderList").data;
                if (data.length > 0) {
                    var ids = [];
                    for (var i = 0; i < data.length; i++) {
                        ids.push(data[i].oid);
                    }
                    $.post(
                        '${pageContext.request.contextPath}/admin/orders/batch',
                        {'ids[]': ids},
                        function (data) {
                            if (data > 0) {
                                $('.layui-laypage-btn').click();
                                layer.msg("删除成功！", {icon: 1});
                            }
                        }
                    );
                } else {
                    layer.msg("请选择至少一行后再批量删除！", {icon: 2});
                }
            },

            //组合搜索
            reload: function () {
                var startTime = $('#startTime').val();
                var endTime = $('#endTime').val();
                var oid = $('#oid').val();
                var state = $('#state').val();

                if ($.trim(startTime).length > 0) {
                    table.reload('orderList', {
                        page: {curr: 1},
                        where: {startTime: startTime}
                    });
                }

                if ($.trim(endTime).length > 0) {
                    table.reload('orderList', {
                        page: {curr: 1},
                        where: {endTime: endTime}
                    });
                }

                if ($.trim(oid).length > 0) {
                    table.reload('orderList', {
                        page: {curr: 1},
                        where: {oid: oid}
                    });
                }
                if ($.trim(state).length > 0) {
                    table.reload('orderList', {
                        page: {curr: 1},
                        where: {state: state}
                    });
                }
            },
        }
    });

</script>
<script type="text/html" id="operateTpl">
    <%--<a href="${pageContext.request.contextPath}/order/order1/details?orderId={{d.orderId}}" class="layui-btn layui-btn-sm layui-btn-warm">--%>
        <%--<i class="layui-icon">&#xe642;</i>--%>
    <%--</a>--%>
    <a href="${pageContext.request.contextPath}/admin/orders/deleteOrder?oid={{d.oid}}" class="layui-btn layui-btn-sm layui-btn-danger">
        <i class="layui-icon">&#xe640;</i>
    </a>
    <a href="${pageContext.request.contextPath}/admin/orders/info?oid={{d.oid}}" class="layui-btn layui-btn-sm layui-btn-danger">
        <i class="layui-icon">&#xe60b;</i>
    </a>


</script>
</body>
</html>
