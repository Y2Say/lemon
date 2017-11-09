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
                    <button class="layui-btn btn_person_list" lay-submit="" lay-filter="login">登录</button>
                    <button class="layui-btn layui-btn-primary register" data-method="notice">注册</button>
                </div>

            </div>
        </div>
    </form>
</div>
<script type="text/javascript">
    layui.config({
        base : "${ctx}/js/"
    }).use(['form','layer','jquery','common'], function () {
        var $ = layui.jquery,
            form = layui.form,
            common = layui.common;


        /**监听登陆提交*/
        form.on('submit(login)', function (data) {
            //弹出loading
            var loginLoading = top.layer.msg('登陆中，请稍候', {icon: 16, time: false, shade: 0.8});
            //记录ajax请求返回值
            var ajaxReturnData;

            var personBean = {
                name:$("[name = name]").val(),
                password:$("[name = password]").val()
            }

            //登陆验证
            $.ajax({
                url: '${ctx}/login',
                type: 'post',
                async: false,
                data: personBean,
                success: function (data) {
                    ajaxReturnData = data;
                }
            });
            //登陆成功
            if (ajaxReturnData.status==200) {
                location.href='${ctx}/views/person/person_list.jsp';
                top.layer.close(loginLoading);
                return false;
            } else {
                top.layer.close(loginLoading);
                common.cmsLayErrorMsg(ajaxReturnData.returnMessage);
                reqCaptcha();
                return false;
            }
        });


    });
</script>
