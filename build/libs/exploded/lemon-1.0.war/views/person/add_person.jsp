<%--
  Created by IntelliJ IDEA.
  User: lemon
  Date: 2017/8/18
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="<%=request.getContextPath()%>/js/person/add_person.js"></script>
<style type="text/css">
    .add_form_style{
        width:500px;
        height:auto;
        margin:auto;
    }
</style>
<div class="layui-main">
    <div class="add_form_style">
        <div class="new_person_title" style="text-align: center;height:50px;margin-top: 20px;font-size:18px;">
            <p>新增用户</p>
        </div>
        <form class="layui-form" action="" method="post">
            <div class="layui-form-item">
                <label class="layui-form-label">用户名：</label>
                <div class="layui-input-block">
                    <input type="text" name="name" id="name" class="layui-input" placeholder="用户名"
                           lay-verify="required" autocomplete="off"/>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">密码：</label>
                <div class="layui-input-block">
                    <input type="text" name="password" id="password" class="layui-input" lay-verify="required"
                           placeholder="密码" autocomplete="off"/>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">身份证号：</label>
                <div class="layui-input-block">
                    <input type="text" placeholder="身份证号" name="identity" id="identity" class="layui-input"
                           autocomplete="off"/>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">联系方式：</label>
                <div class="layui-input-block">
                    <input type="text" name="phone" id="phone" class="layui-input" placeholder="联系方式"
                           autocomplete="off"/>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">城市：</label>
                <div class="layui-input-block">
                    <input type="text" name="city" id="city" class="layui-input" placeholder="城市"/>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">职位：</label>
                <div class="layui-input-block">
                    <input type="text" name="position" id="position" class="layui-input" placeholder="职位"/>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">签名：</label>
                <div class="layui-input-block">
                    <textarea class="layui-textarea" id="sign" name="sign" cols="10" rows="5"></textarea>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">性别：</label>
                <div class="layui-input-block">
                    <input type="radio" name="sex" value="男" title="男" checked="">
                    <input type="radio" name="sex" value="女" title="女">
                </div>
            </div>
            <div class="layui-form-item">
                <div class="layui-input-block">
                    <button class="layui-btn layui-btn-default btn_add_person" lay-submit="" lay-filter="add_person">提交
                    </button>
                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                </div>
            </div>
        </form>
    </div>
</div>