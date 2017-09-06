<%--
  Created by IntelliJ IDEA.
  User: lemon
  Date: 2017/8/18
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="include.jsp" %>

<div class="layui-logo logo_style">Lemon</div>
<!-- 头部区域（可配合layui已有的水平导航） -->
<%--<div class=""><input type="text" placeholder="搜索" class="layui-input search"/></div>--%>
<ul class="layui-nav layui-layout-left top-nav-container">
    <li class="layui-nav-item layui-this"><a href="javascript:void(0)">清<%--<span class="layui-badge layui-bg-gray">3</span>--%></a></li>
    <li class="layui-nav-item"><a href="javascript:void(0)">凉</a></li>
    <li class="layui-nav-item"><a href="javascript:void(0)">一</a></li>
    <li class="layui-nav-item">
        <a href="javascript:void(0)">夏</a>
        <%--<dl class="layui-nav-child">
            <dd><a href="">来</a></dd>
            <dd><a href="">吃</a></dd>
            <dd><a href="">瓜</a></dd>
        </dl>--%>
    </li>
</ul>
<ul class="layui-nav layui-layout-right">
    <li class="layui-nav-item">
        <a href="javascript:;">
            <img src="<%=request.getContextPath()%>/img/default/002.png" alt="" class="layui-nav-img">
            青柠檬
        </a>
        <dl class="layui-nav-child">
            <dd><a href="">who am i</a></dd>
            <dd><a href="">help</a></dd>
            <dd><a href="">say goodbye&nbsp;&nbsp;<i class="layui-icon">&#xe6af;</i></a></dd>
        </dl>
    </li>
    <li class="layui-nav-item"><a href="">撤</a></li>
</ul>
<link href="<%=request.getContextPath()%>/css/layout/banner.css" rel="stylesheet"/>


