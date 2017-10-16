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
    <div class="avatar_style" ><input class="avatar_label" title placeholder="那年花开月正圆"/></div>
</div>
<ul class="layui-nav layui-nav-tree left_menu_ul layui-this"  lay-filter="menu_filter">
    <li class="layui-nav-item">
        <a class="" href="javascript:;"><i class="layui-icon" style="font-size: 15px; color: #009688;">&#xe68e;</i>首页<span class="layui-nav-more"></span></a>
        <dl class="layui-nav-child">
            <dd><a href="<%=request.getContextPath()%>/views/history/take_nodes.jsp">时间线</a></dd>
        </dl>
    </li>
    <li class="layui-nav-item">
        <a href="javascript:;"><i class="layui-icon" style="font-size: 15px; color: #009688;">&#xe62a;</i>文章管理</a>
        <dl class="layui-nav-child">
            <dd><a href="<%=request.getContextPath()%>/views/favorites/vegetables.jsp">文章列表</a></dd>
            <dd><a href="<%=request.getContextPath()%>/views/favorites/flowers.jsp">上传文件</a></dd>
            <dd><a href="<%=request.getContextPath()%>/views/favorites/animals.jsp">文本编辑</a></dd>
        </dl>
    </li>
    <li class="layui-nav-item">
        <a href="javascript:;"><i class="layui-icon" style="font-size: 15px; color: #009688;">&#xe613;</i>用户管理</a>
        <dl class="layui-nav-child">
            <dd><a href="<%=request.getContextPath()%>/views/person/person_list.jsp">用户列表</a></dd>
            <dd><a href="<%=request.getContextPath()%>/views/person/add_person.jsp">新增用户</a></dd>
        <dd><a href="<%=request.getContextPath()%>/views/history/detail.jsp">用户详情</a></dd>
        </dl>
    </li>
    <li class="layui-nav-item"><a href="<%=request.getContextPath()%>/views/common/settings.jsp"><i class="layui-icon" style="font-size: 15px; color: #009688;">&#xe620;</i>设置</a>
    </li>
</ul>
