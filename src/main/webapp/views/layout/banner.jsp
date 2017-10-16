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
    <li class="layui-nav-item layui-this"><a href="<%=request.getContextPath()%>/view/person/person_list.jsp"><i class="layui-icon" style="font-size: 15px; color: #009688;">&#xe68e;</i>首页</a></li>
    <li class="layui-nav-item"><a href="<%=request.getContextPath()%>/views/common/version_info.jsp"><i class="layui-icon" style="font-size: 15px; color: #009688;">&#xe62c;</i>版本信息</a></li>
    <li class="layui-nav-item"><a href="<%=request.getContextPath()%>/views/common/settings.jsp"><i class="layui-icon" style="font-size: 15px; color: #009688;">&#xe614;</i>设置</a></li>
    <li class="layui-nav-item">
        <a href="<%=request.getContextPath()%>/views/common/links.jsp"><i class="layui-icon" style="font-size: 15px; color: #009688;">&#xe64c;</i>友情链接</a>

    </li>
</ul>
<ul class="layui-nav layui-layout-right">
    <li class="layui-nav-item">
        <a href="javascript:;">
            <img src="<%=request.getContextPath()%>/img/default/002.png" alt="" class="layui-nav-img">
            青柠檬
        </a>
        <dl class="layui-nav-child">
            <dd><a href="">help</a></dd>
            <dd><a href="">say goodbye&nbsp;&nbsp;<i class="layui-icon">&#xe6af;</i></a></dd>
        </dl>
    </li>
    <li class="layui-nav-item"><a href=""><i class="layui-icon"></i></a></li>
</ul>
<link href="<%=request.getContextPath()%>/css/layout/banner.css" rel="stylesheet"/>


