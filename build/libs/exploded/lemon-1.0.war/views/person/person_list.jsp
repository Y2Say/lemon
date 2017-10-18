<%--
  Created by IntelliJ IDEA.
  User: lemon
  Date: 2017/8/18
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<link href="<%=request.getContextPath()%>/css/person/person_list.css" rel="stylesheet" />
<script src="<%=request.getContextPath()%>/js/person/person_list.js"></script>
<div class="list_title">用户列表</div>
<%--<table class="layui-table">
    <colgroup>
        <col width="15%">
        <col width="15%">
        <col width="15%">
        <col width="15%">
        <col>
    </colgroup>
    <thead>
    <tr>
        <th>ID</th>
        <th>用户名</th>
        <th>时间</th>
        <th>城市</th>
        <th>签名</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>1</td>
        <td>orange</td>
        <td>2016-11-29</td>
        <td>上海</td>
        <td><input type="text" class="layui-input" placeholder="在绝望里 虔诚的人 都长出了翅膀"/></td>
    </tr>
    <tr>
        <td>2</td>
        <td>apple</td>
        <td>2017-09-28</td>
        <td>北京</td>
        <td><input type="text" class="layui-input" placeholder="而长大以后 梦中飞舞的萤火虫，在我的身体 陪我做梦"/></td>
    </tr>
    <tr>
        <td>3</td>
        <td>banana</td>
        <td>2016-11-29</td>
        <td>深圳</td>
        <td><input type="text" class="layui-input" placeholder="然后飞行更遥远的地方"/></td>
    </tr>
    <tr>
        <td>4</td>
        <td>stryberry</td>
        <td>2016-11-28</td>
        <td>杭州</td>
        <td><input type="text" class="layui-input" placeholder="在黑夜里迷路的人才能找到方向"/></td>
    </tr>
    </tbody>
</table>--%>

<table class="layui-table" lay-data="{height:313, url:'/person/list'}">
    <thead>
    <tr>
        <th lay-data="{field:'id', width:80, sort: true}">ID</th>
        <th lay-data="{field:'name', width:80}">用户名</th>
        <th lay-data="{field:'sex', width:80, sort: true}">性别</th>
        <th lay-data="{field:'city', width:80}">城市</th>
        <th lay-data="{field:'sign', width:177}">签名</th>
        <th lay-data="{field:'position', width:80}">职位</th>
        <th lay-data="{field:'identity', width:177}">PID</th>
    </tr>
    </thead>
</table>




<button type="button" class="layui-btn layui-btn-primary btn_save">保存</button>
<button type="button" class="layui-btn layui-btn-primary btn_add_person">新增</button>



