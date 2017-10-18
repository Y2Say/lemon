<%--
  Created by IntelliJ IDEA.
  User: jyj
  Date: 2017/10/16
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link href="<%=request.getContextPath()%>/css/common/version_info.css" rel="stylesheet" />
    <script src="<%=request.getContextPath()%>/js/common/version_info.js"></script>
</head>
<body>
<div class="list_title">系统信息</div>
<table class="layui-table">
    <colgroup>
        <col width="50%">
        <col width="50%">
    </colgroup>
    <tr>
        <td>模板名称</td>
        <td>layui后台管理模板</td>
    </tr>
    <tr>
        <td>网站首页</td>
        <td>/index.jsp</td>
    </tr>
    <tr>
        <td>服务器环境</td>
        <td>Windows</td>
    </tr>

    <tr>
        <td>版本号</td>
        <td>v1.0.1</td>
    </tr>
</table>
</body>
</html>
