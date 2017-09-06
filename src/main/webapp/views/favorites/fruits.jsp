<%--
  Created by IntelliJ IDEA.
  User: jyj
  Date: 2017/8/23
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script src="<%=request.getContextPath()%>/js/favorites/fruits.js"></script>
<table class="layui-table">
    <colgroup>
        <col width="150">
        <col width="200">
        <col>
    </colgroup>
    <thead>
    <tr>
        <th>昵称</th>
        <th>加入时间</th>
        <th>签名</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>贤心</td>
        <td>2016-11-29</td>
        <td>人生就像是一场修行</td>
    </tr>
    <tr>
        <td>许闲心</td>
        <td>2016-11-28</td>
        <td>于千万人之中遇见你所遇见的人，于千万年之中，时间的无涯的荒野里…</td>
    </tr>
    </tbody>
</table>

<script>
    layui.use('carousel', function(){
        var carousel = layui.carousel;
        //建造实例
        carousel.render({
            elem: '#fruit_img'
            ,width: '100%' //设置容器宽度
            ,arrow: 'always' //始终显示箭头
            //,anim: 'updown' //切换动画方式
        });
    });
</script>

<link href="<%=request.getContextPath()%>/css/favorites/fruits.css" rel="stylesheet" />