<%--
  Created by IntelliJ IDEA.
  User: jyj
  Date: 2017/8/23
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style type="text/css">
        .title{
                text-align: center;
                font-family: "Microsoft YaHei UI";
                font-size:18px;
                margin-top:20px;
        }
        .msg_show{
                float:right;
                margin-right:30px;
                margin-top:20px;
        }
</style>
<div class="title">
        编辑发表内容
</div>
<div class="layui-main" style="margin-top:50px;">
        <textarea id="demo" style="display: none"></textarea>
</div>
<button type="button" class="layui-btn msg_show">发表</button>
<script>
    layui.use('layedit', function(){
        var layedit = layui.layedit;
        layedit.build('demo');
    });
</script>
