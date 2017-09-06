<%--
  Created by IntelliJ IDEA.
  User: jyj
  Date: 2017/8/22
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="<%=request.getContextPath()%>/css/layout/menu.css" rel="stylesheet"/>
<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
<div class="left_top">
    <a href="#" title="头像"><img src="<%=request.getContextPath()%>/img/default/001.png" class="left_avatar"/></a>
    <p class="avatar_label">春风十里 不如你</p>
</div>
<ul class="layui-nav layui-nav-tree left_menu_ul layui-this"  lay-filter="menu_filter">
    <li class="layui-nav-item">
        <a class="" href="javascript:;">夏<span class="layui-nav-more"></span></a>
        <dl class="layui-nav-child">
            <dd><a href="<%=request.getContextPath()%>/views/favorites/fruits.jsp">芳</a></dd>
            <dd><a href="<%=request.getContextPath()%>/views/favorites/vegetables.jsp">香</a></dd>
            <dd><a href="<%=request.getContextPath()%>/views/favorites/flowers.jsp">四</a></dd>
            <dd><a href="<%=request.getContextPath()%>/views/favorites/animals.jsp">溢</a></dd>
        </dl>
    </li>
    <li class="layui-nav-item">
        <a href="javascript:;">日</a>
        <dl class="layui-nav-child">
            <dd><a href="<%=request.getContextPath()%>/views/history/take_nodes.jsp">一</a></dd>
            <dd><a href="<%=request.getContextPath()%>/views/person/add_person.jsp">支</a></dd>
            <dd><a href="<%=request.getContextPath()%>/views/history/detail.jsp">独</a></dd>
            <dd><a href="<%=request.getContextPath()%>/views/person/person_list.jsp">秀</a></dd>
        </dl>
    </li>
    <li class="layui-nav-item"><a href="">盛</a></li>
    <li class="layui-nav-item"><a href="">典</a></li>
</ul>
<ul class="layui-nav layui-nav-tree layui-hide left_menu_ul content_put_manage"  lay-filter="menu_filter">
    <li class="layui-nav-item"><a href="">桃</a></li>
    <li class="layui-nav-item"><a href="">林</a></li>
</ul>
<ul class="layui-nav layui-nav-tree layui-hide left_menu_ul"  lay-filter="menu_filter">
    <li class="layui-nav-item"><a href="">荔</a></li>
    <li class="layui-nav-item"><a href="">枝</a></li>
</ul>
<ul class="layui-nav layui-nav-tree layui-hide left_menu_ul "  lay-filter="menu_filter">
    <li class="layui-nav-item"><a href="">魔</a></li>
    <li class="layui-nav-item"><a href="">音</a></li>
</ul>