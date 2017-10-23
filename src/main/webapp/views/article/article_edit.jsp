<%--
  Created by IntelliJ IDEA.
  User: jyj
  Date: 2017/8/23
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../layout/include.jsp" %>
<style type="text/css">
    .banner_title {
        text-align: center;
        font-family: "Microsoft YaHei UI";
        font-size: 18px;
        margin-top: 20px;
        margin-bottom: 30px;
    }

    .msg_show {
        float: right;
        margin-right: 30px;
        margin-top: 20px;
    }

    .article_content {
        width: 80%;
        margin-left: 50px;
    }
</style>

<div class="layui-main" style="margin-top:50px;">
    <div class="article_content">
        <div class="banner_title">
            新增文章
        </div>
        <form class="layui-form" action="" method="post">
            <div class="layui-form-item">
                <label class="layui-form-label">标题：</label>
                <div class="layui-input-block">
                    <input type="text" name="title" id="title" class="layui-input" placeholder="标题"
                           lay-verify="required" autocomplete="off"/>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">作者：</label>
                <div class="layui-input-block">
                    <input type="text" name="author" id="author" class="layui-input" placeholder="作者"
                           lay-verify="required" autocomplete="off"/>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">审核状态：</label>
                <div class="layui-input-block">
                    <input type="text" name="status" id="status" class="layui-input" placeholder="状态"
                           lay-verify="required" autocomplete="off"/>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">浏览权限：</label>
                <div class="layui-input-block">
                    <input type="radio" name="visit" value="所有人可见" title="所有人可见"/>
                    <input type="radio" name="visit" value="仅自己可见" title="仅自己可见"/>
                    <input type="radio" name="visit" value="部分人可见" title="部分人可见">
                    <input type="radio" name="visit" value="部分人不可见" title="部分人不可见">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">编辑内容：</label>
                <div class="layui-input-block">
                    <textarea id="content" style="display: none" name="content"></textarea>
                </div>
            </div>

        </form>
        <button type="button" class="layui-btn" lay-submit="" lay-filter="article_show">发表</button>
    </div>
</div>
<%--<div class="layui-main" style="margin-top:50px;">
        <textarea id="demo" style="display: none"></textarea>
</div>--%>

<script>
    layui.config({
        base: "${ctx}/js/"
    }).use(['form', 'layedit', 'jquery'], function () {
        var layedit = layui.layedit,
            form = layui.form,
            $ = layui.$;

        layedit.build('content');

        //发表新文章

        form.on("submit(article_show)", function (data) {
            /*var articleSaveLoading = top.layer.msg('数据提交中，请稍候', {icon: 16, time: false, shade: 0.8});*/
            /*console.log("data:"+data.data.field);*/
            console.log("data1:"+data);
            $.ajax({
                url: '${ctx}/article/add',
                type: 'post',
                async: false,
                data: data.field,
                success: function (data) {
                    if (data.returnCode == 200) {
                        common.cmsLaySucMsg("文章新增成功！");
                    } else {
                        common.cmsLayErrorMsg(data.returnMessage);
                    }
                }, error: function (data) {
                }
            });
            return false;
        });
    });
</script>
