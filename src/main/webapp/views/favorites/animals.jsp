<%--
  Created by IntelliJ IDEA.
  User: jyj
  Date: 2017/8/23
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="layui-main" style="margin-top:50px;">
        <textarea id="demo" style="display: none"></textarea>
</div>

<script>
    layui.use('layedit', function(){
        var layedit = layui.layedit;
        layedit.build('demo');
    });
</script>
