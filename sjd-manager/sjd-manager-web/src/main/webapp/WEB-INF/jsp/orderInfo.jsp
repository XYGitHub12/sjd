<%--
  Created by IntelliJ IDEA.
  User: maill
  Date: 2018/7/23
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <legend>订单管理 - 订单信息</legend>
                <div class="layui-field-box">
                    <!-- 主体 -->
                    <div class="lbody">
                        <!-- 主要内容 -->
                        <div class="">
                            <fieldset class="layui-elem-field site-demo-button layui-field-res">
                                <legend>订单信息</legend>
                                <div class="table-list">
                                    <table class="layui-table layui-list-table" lay-skin="line">
                                        <thead>
                                        <tr>
                                            <th>订单编号</th>
                                            <th>下单时间</th>
                                            <th>订单总额</th>
                                            <th>订单状态</th>
                                            <th>支付方式</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${orderInfo }" var="entry">
                                            <tr>
                                                <td><span class="layui-table-bd">${entry.oid}</span></td>
                                                <%--<td class="layui-table-first"><span class="layui-table-bd"><img--%>
                                                        <%--class="img-cp fl mr10" src="${entry.picPath}"--%>
                                                        <%--alt="">${entry.title}</span></td>--%>
                                                <%--<td><span class="layui-table-bd price">${entry.num}21321312</span></td>--%>
                                                <%--<td><span class="layui-table-bd price">${entry.price}2018-09-13</span>--%>
                                                <%--</td>--%>
                                                <%--<td><span class="layui-table-bd price">${entry.totalFee}3444.90</span>--%>
                                                <%--</td>--%>
                                                <%--<td><span class="layui-table-bd price">${entry.totalFee}已付款</span></td>--%>
                                                <%--<td><span class="layui-table-bd price">${entry.totalFee}支付宝</span></td>--%>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                    <table class="layui-table" id="orderItemList"></table>
                                </div>

                            </fieldset>

                            <fieldset class="layui-elem-field site-demo-button layui-field-res">
                                <legend>商品信息</legend>
                                <div class="table-list">
                                    <table class="layui-table layui-list-table" lay-skin="line">
                                        <thead>
                                        <tr>
                                            <th>商品编号</th>
                                            <th>商品名称</th>
                                            <th>商品数量</th>
                                            <th>商品价格</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${tbOrderItems }" var="entry">
                                            <tr>
                                                <td><span class="layui-table-bd">${entry.itemId}</span></td>
                                                <td class="layui-table-first"><span class="layui-table-bd"><img
                                                        class="img-cp fl mr10" src="${entry.picPath}"
                                                        alt="">${entry.title}</span></td>
                                                <td><span class="layui-table-bd price">${entry.num}</span></td>
                                                <td><span class="layui-table-bd price">${entry.price}</span></td>
                                                <td><span class="layui-table-bd price">${entry.totalFee}</span></td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                    <table class="layui-table" id="orderItemList"></table>
                                </div>
                            </fieldset>

                            <fieldset class="layui-elem-field site-demo-button layui-field-res">
                                <legend>收货信息</legend>
                                <div class="layui-field-box">
                                    <table class="layui-table" lay-skin="nob">
                                        <tbody>
                                        <tr>
                                            <td>收货人: <span class="layui-field-bd">${tbOrderShipping.receiverName}</span>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>手机号码: <span
                                                    class="layui-field-bd">${tbOrderShipping.receiverMobile}</span></td>
                                        </tr>
                                        <tr>
                                            <td>收货地址: <span
                                                    class="layui-field-bd">${tbOrderShipping.receiverAddress}</span>
                                            </td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </fieldset>

                            <button></button>
                        </div>
                    </div>

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

</body>
</html>
