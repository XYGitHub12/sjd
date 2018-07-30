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
    <title>京淘后台管理系统</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/layui/css/layui.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/global.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/icheck/minimal/red.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">京淘后台管理系统</div>
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/users">用户列表</a></li>
        </ul>
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
            <li class="layui-nav-item"><a href="">退出</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item"><a class="layui-this" href="${pageContext.request.contextPath}/index">管理系统</a></li>

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
                <legend>用户管理 - 用户列表</legend>
                <div class="weadmin-body">

                <div class="layui-field-box">

                    <form class="layui-form layui-col-md12 we-search" onsubmit="return false;">
                        用户搜索：
                        <div class="layui-inline">
                            <input type="text" id="title" name="title" placeholder="请输入用户名称关键字" autocomplete="off"
                                   class="layui-input">
                        </div>
                        <button class="layui-btn" lay-submit="" lay-filter="search" data-type="reload"><i class="layui-icon">&#xe615;</i>
                        </button>
                    </form>


                    <hr>
                    <div class="layui-btn-group">
                        <button class="layui-btn layui-btn-xs layui-btn-normal dw-dailog" dw-url="create.html" dw-title="新增用户" dw-width="100%" dw-height="100%">
                            <i class="layui-icon">&#xe654;</i>新增
                        </button>
                        <button class="layui-btn layui-btn-xs layui-btn-danger " data-type="getCheckData" >
                            <i class="layui-icon">&#xe640;</i>删除
                        </button>
                        <button class="layui-btn layui-btn-xs dw-refresh">
                            <i class="layui-icon">&#x1002;</i>刷新
                        </button>
                    </div>
                    <hr>
                    <table class="layui-hide" id="articleList"></table>
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
<script type="text/javascript" src="${pageContext.request.contextPath}/static/icheck/icheck.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/javascript/dw.js"></script>
<script type="text/html" id="operateTpl">

    <a title="编辑" href="${pageContext.request.contextPath}/admin/user/getUserByUid?uid={{d.uid}}">
        <i class="layui-icon">&#xe642;</i>
    </a>
    <a title="删除" href="${pageContext.request.contextPath}/admin/user/deleteUserByUid?uid={{d.uid}}">
        <i class="layui-icon">&#xe640;</i>
    </a>
</script>


<script type="text/javascript">
[]
    layui.use(['table'], function () {
        var table = layui.table;
        table.render({
            //表格属性
            //要渲染的容器
            page: true,
            elem: '#articleList',
            //异步请求
            align:'center',
            url: '${pageContext.request.contextPath}/admin/user/getUsers',
            //列
            cols: [[
                {type: 'checkbox'},
                {field: 'uid', title: '编号'},
                {field: 'uname', title: '名称'},
                {field: 'uphone', title: '手机'},
                {field: 'uemail', title: '邮箱'},
                {field: 'ustatus', title: '状态'},
                {field: 'utype', title: '类型'},
                {field: 'ulevel', title: '等级'},
                {field: 'uid', title: '操作', templet: '#operateTpl'}
            ]]

        });
        $('.demoTable .layui-btn-danger').click(function () {
            var type = $(this).data('type');

            active[type] ? active[type].call(this) : '';
        });
        $('.weadmin-body .layui-btn').on('click',function(){
            var type = $(this).data('type');//reload
            active[type] ? active[type].call(this) : '';
        });

        var active = {
            reload:function(){
                var title = $('#title').val();
                if($.trim(title).length > 0){
                    table.reload('articleList',{
                        page:{curr:1},
                        where:{title:title}
                    });
                }
            },
            getCheckData: function () {
                var data = table.checkStatus('articleList').data;
                if (data.length > 0) {
                    var ids = [];
                    for (var i = 0; i < data.length; i++) {
                        ids.push(data[i].uid);
                    }
                    $.post(
                        '${pageContext.request.contextPath}/admin/user/removeUsers',
                        {'ids[]': ids},
                        function(data){
                            if (data > 0) {
                                $('.layui-laypage-btn').click();
                                layer.msg("恭喜，删除成功！", {icon: 1});
                            }
                        }
                    );
                } else {
                    layer.msg('请至少选中一行再进行删除!', {icon: 2});
                }
            }
        };
    });

</script>



</body>
</html>
