<%--
  Created by IntelliJ IDEA.
  User: jyj
  Date: 2017/10/16
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../layout/include.jsp" %>
<style type="text/css">
    .site_url{
        color:blue;
    }
</style>
<blockquote class="layui-elem-quote site_search">
    <div class="layui-inline">
        <div class="layui-input-inline">
            <input type="text" placeholder="请输入关键字" class="layui-input search_input"/>
        </div>
        <a class="layui-btn siteSearch_btn">查询</a>
    </div>
    <div class="layui-inline">
        <a class="layui-btn layui-btn-normal siteAdd_btn">添加链接</a>
    </div>
    <div class="layui-inline">
        <a class="layui-btn layui-btn-danger siteBatchDel">批量删除</a>
    </div>
</blockquote>

<table class="layui-table" lay-data="{width: 915, url:'/site/list', id:'siteId'}" lay-filter="site">
    <thead>
    <tr>
        <th lay-data="{checkbox:true, fixed: true}"></th>
        <th lay-data="{field:'id',width:100}">ID</th>
        <th lay-data="{field:'siteName', width:200}">网站名称</th>
        <th lay-data="{field:'siteUrl', width:200, templet:'#siteUrl_link'}">网站地址</th>
        <th lay-data="{field:'createdTime', width:200}">添加时间</th>
        <th lay-data="{fixed: 'right', width:160, align:'center', toolbar: '#siteBar'}">操作</th>
    </tr>
    </thead>
</table>

<script type="text/html" id="siteBar">
    <a class="layui-btn layui-btn-primary layui-btn-mini" lay-event="detail">查看</a>
    <a class="layui-btn layui-btn-mini" lay-event="site_edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="site_del">删除</a>
</script>
<script type="text/html" id="siteUrl_link">
    <a href="/{{d.siteUrl}}" class="layui-table-link">{{d.siteUrl}}</a>
</script>
<script>
    layui.config({
        base : "${ctx}/js/"
    }).use('table', function(){
        var table = layui.table;
        //监听表格复选框选择
        table.on('checkbox(site)', function(obj){
            console.log(obj)
        });
        //监听工具条
        table.on('tool(site)', function(obj){
            var data = obj.data;
            if(obj.event === 'detail'){
                layer.msg('ID：'+ data.id + ' 的查看操作');
            } else if(obj.event === 'site_del'){
                layer.confirm('真的删除该行么', function(index){
                    $.ajax({
                        url : '${ctx}/site/delete',
                        type : 'post',
                        async: false,
                        data : param,
                        success : function(data) {
                            if(data.returnCode == 200){
                                top.layer.msg(data.returnMessage);
                                location.reload();
                            }else{
                                top.layer.msg(data.returnMessage);
                            }
                        },error:function(data){

                        }
                    });
                    layer.close(index);
                });
            } else if(obj.event === 'edit'){
                layer.alert('编辑行：<br>'+ JSON.stringify(data))
            }
        });

        var $ = layui.$, active = {
            getCheckData: function(){ //获取选中数据
                var checkStatus = table.checkStatus('siteId')
                    ,data = checkStatus.data;
                layer.alert(JSON.stringify(data));
            }
            ,getCheckLength: function(){ //获取选中数目
                var checkStatus = table.checkStatus('siteId')
                    ,data = checkStatus.data;
                layer.msg('选中了：'+ data.length + ' 个');
            }
            ,isAll: function(){ //验证是否全选
                var checkStatus = table.checkStatus('siteId');
                layer.msg(checkStatus.isAll ? '全选': '未全选')
            }
        };

        $('.demoTable .layui-btn').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });

        /**新增菜单*/
        $(".siteAdd_btn").click(function(){
            var url = "${ctx}/site/add";
            common.cmsLayOpen('添加链接',url,'750px','470px');
        });
    });
</script>
