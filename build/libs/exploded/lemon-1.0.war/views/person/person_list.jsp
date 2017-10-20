<%--
  Created by IntelliJ IDEA.
  User: lemon
  Date: 2017/8/18
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../layout/include.jsp" %>
<link href="<%=request.getContextPath()%>/css/person/person_list.css" rel="stylesheet"/>
<script src="<%=request.getContextPath()%>/js/person/person_list.js"></script>
<div class="list_title">用户列表</div>
<%--

<table class="layui-table" id="person_table_list" lay-filter="person_table_id" lay-data="{initSort:{field:'id', type:'desc'},height:315, url:'${ctx}/person/list'}">
    <thead>
    <tr>
        <th layui-data="{checkbox: true,fixed:'left'}"></th>
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
--%>


<table class="layui-table" id="person_table_list" lay-filter="person_table_id">
</table>

<button type="button" class="layui-btn layui-btn-primary btn_save">保存</button>
<button type="button" class="layui-btn layui-btn-primary btn_add_person">新增</button>


<script type="text/javascript">
    layui.config({
        base: "${ctx}/js/"
    }).use(['form', 'table', 'layer', 'common'], function () {
        var $ = layui.$,
            form = layui.form,
            table = layui.table,
            layer = layui.layer,
            common = layui.common;

        /**表格加载*/
        table.render({
            elem: '#person_table_list',
            url: '${ctx}/person/list',
            id: 'person_table_id',
            height: 'full-140',
            width: '1699',
            skin: 'row',
            even: 'true',
            cols: [[
                {checkbox: true, fixed: 'left',width:'60'},
                {field: 'id', title: 'ID', width: '200'},
                {field: 'name', title: '用户名', width: '200'},
                {field: 'sex', title: '性别', width: '200'},
                {field: 'city', title: '城市', width: '200'},
                {field: 'position', title: '职位', width: '200'},
                {field: 'identity', title: 'PID', width: '200'},
                {field: 'sign', title: '签名', width: '240'},
                {fixed: 'right', title: '操作', align: 'center', width: '200'}
            ]],
            initSort: {
                field: 'id' //排序字段，对应 cols 设定的各字段名
                , type: 'desc' //排序方式  asc: 升序、desc: 降序、null: 默认排序
            }
        });

        /**查询*/
        /* $(".roleSearchList_btn").click(function(){
         //监听提交
         form.on('submit(roleSearchFilter)', function (data) {
         table.reload('roleTableId',{
         where: {
         searchTerm:data.field.searchTerm,
         searchContent:data.field.searchContent
         },
         height: '140px'
         });
         });

         });*/
        /**角色新增*/
        $(".btn_add_person").click(function () {
            var url = "${ctx}/person/add";
            common.cmsLayOpen('新增', url, '550px', '340px');
        });

    });
</script>
