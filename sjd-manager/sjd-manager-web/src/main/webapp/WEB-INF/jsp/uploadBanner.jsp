<%--
  Created by IntelliJ IDEA.
  User: maill
  Date: 2018/7/23
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>layout 后台大布局 - Layui</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/lib/layui/css/layui.css">

</head>
<body>
<div class="layui-container">
    <div class="layui-row">
        <div class="layui-col-lg12">
            <fieldset class="layui-elem-field">
                <legend>轮播图管理 - 添加图片</legend>
                <div class="layui-field-box">
                    <form class="layui-form" action="${pageContext.request.contextPath}/admin/product/updateBannerURL" method="post"
                          enctype="multipart/form-data">
                        <div class="layui-form-item">
                            <label class="layui-form-label">轮播图序号</label>
                            <div class="layui-input-block">
                                <select name="id" lay-verify="required">
                                    <option value="0">请选择</option>
                                    <c:forEach items="${list}" var="l" varStatus="vs">
                                        <option value="${l.id}">${vs.count}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">商品图片</label>
                            <div class="layui-input-block">
                                <button type="button" class="layui-btn" id="upload1">上传图片</button>
                                <input type="hidden" id="img_url" name="pic" value=""/>
                                <div class="layui-upload-list">
                                    <img class="layui-upload-img" width="200px" height="150px" id="demo1"/>
                                    <p id="demoText"></p>
                                </div>
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <div class="layui-input-block">
                                <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
                                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                            </div>
                        </div>
                    </form>
                </div>
            </fieldset>
        </div>
    </div>
</div>


<script type="text/javascript" src="${pageContext.request.contextPath}/static/javascript/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.js"></script>
<%--<script type="text/javascript" src="${pageContext.request.contextPath}/static/javascript/dw_form_submit.js"></script>--%>
<script type="text/javascript">
    layui.use(['element','form'], function(){
        var element = layui.element;
        var form = layui.form;
        //监听提交
        form.on('submit(formDemo)', function(data){
            var action = data.form.action;//表单提交URL地址
            console.log(JSON.stringify(data.field));//表单数据
            $.post(action,data.field,function(obj){

                window.location="${pageContext.request.contextPath}/products";
            });
            return false;//注释掉这行代码后，表单将会以普通方式提交表单，否则以ajax方式提交表单
        });
    });
</script>
<script type="text/javascript" th:inline="javascript">
    layui.use('upload', function(){
        var upload = layui.upload
            , $ = layui.jquery;
        var uploadInst = upload.render({
            elem: '#upload1' //绑定元素
            ,url: '${pageContext.request.contextPath}/upload/img'
            ,before: function(obj){
                //预读本地文件示例，不支持ie8
                obj.preview(function(index, file, result){
                    $('#demo1').attr('src', result); //图片链接（base64）
                });
            }
            ,done: function(res){
                //如果上传失败
                if(res.code > 0){
                    return layer.msg('上传失败');
                }
                //上传成功
                //alert("上传成功"+res.url);
                document.getElementById("img_url").value = res.url;

            }
            ,error: function(){
                //演示失败状态，并实现重传
                var demoText = $('#demoText');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-mini demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function(){
                    uploadInst.upload();
                });
            }
        });
    });
</script>

</body>
</html>