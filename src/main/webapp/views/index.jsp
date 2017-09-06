<%--
  Created by IntelliJ IDEA.
  User: lemon
  Date: 2017/8/15
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="layout/include.jsp" %>
<style>
    .login_page {
        margin: 200px auto 0px;
        width: 400px;
        height: auto;
        padding-bottom:3px;
        background-color: #CDCDCD;
    }
    .layui-input-block {
        margin-right: 40px;
    }
    .logo_style {
        text-align: center;
        font-size: 18px;
        font-family: PingFangSC-Regular;
        padding: 30px 0px 20px;
    }

    .login_page .btn_style {
        margin-top: 40px;
    }

</style>

<div class="layui-main login_page">
    <form class="layui-form" action="">
        <div class="layui-form-item logo_style">
            Lemon
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">用户名：</label>
            <div class="layui-input-block"><input type="text" name="name" id="name" class="layui-input input_style"/>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">密码：</label>
            <div class="layui-input-block">
                <input type="text" name="password" id="password" class="layui-input input_style"/>
            </div>
        </div>
        <div class="layui-form-item btn_style">
            <div class="layui-input-block">
                <div class="site-demo-button" id="layerDemo">
                    <button class="layui-btn btn_person_list" lay-submit="" lay-filter="demo1">登录</button>
                    <button class="layui-btn layui-btn-primary register" data-method="notice">注册</button>
                </div>

            </div>
        </div>
    </form>
</div>
<script type="text/javascript">

    layui.use(['form', 'layer'], function () {
        var form = layui.form
            , layer = layui.layer
            , $ = layui.jquery

        form.on('submit(demo1)', function (data) {
            location.href = contextPath + '/views/person/person_list.jsp'
            return false;
        })

        /*var active= {
            notice: function () {*/
                layer.open({
                    type: 1
                    ,
                    title: false
                    ,
                    closeBtn: false
                    ,
                    area: '400px'
                    ,
                    shade: 0.8
                    ,
                    id: 'LAY_layuipro' //设定一个id，防止重复弹出
                    ,
                    btn: ['注册', '登录']
                    ,
                    moveType: 1 //拖拽模式，0或者1
                    ,
                    content: '<div style="background-color: #393D49; color: #fff; font-weight: 300; padding-bottom: 3px;"><form class="layui-form" action=""> <div class="layui-form-item logo_style">Lemon </div> <div class="layui-form-item"> <label class="layui-form-label">用户名：</label> <div class="layui-input-block" style="margin-right: 40px;"><input type="text" name="name" id="name" class="layui-input input_style"/> </div> </div> <div class="layui-form-item"> <label class="layui-form-label">密码：</label> <div class="layui-input-block" style="margin-right: 40px;"> <input type="text" name="password" id="password" class="layui-input input_style"/> </div> </div> <div class="layui-form-item"> <label class="layui-form-label">确认密码：</label> <div class="layui-input-block" style="margin-right: 40px;"> <input type="text" name="repassword" id="repassword" class="layui-input input_style"/> </div> </div> </form></div>'
                });
           /* }
        };*/

        $('#layerDemo .layui-btn').on('click', function(){
            var othis = $(this), method = othis.data('method');
            active[method] ? active[method].call(this, othis) : '';
        });
    });
</script>
