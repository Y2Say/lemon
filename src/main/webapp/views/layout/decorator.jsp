<%--
  Created by IntelliJ IDEA.
  User: jyj
  Date: 2017/8/22
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="include.jsp" %>

<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <%@ include file="banner.jsp" %>
    </div>
    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <%@ include file="menu.jsp" %>
        </div>
    </div>
    <div class="layui-body">

        <sitemesh:write property='body'/>
    </div>
    <div class="layui-footer" style="text-align: center">
        <div class="layui-main">
        <p>@2017 Lemon</p>
        </div>
    </div>
</div>

<script>
    //JavaScript代码区域
    layui.use('element', function () {
        var element = layui.element;
    });

</script>
