/**
 * Created by jyj on 2017/8/18.
 */

layui.use(['layer', 'form', 'element'], function () {
    var layer = layui.layer
        , form = layui.form
        , element = layui.element
        , $ = layui.jquery

    var gather = {
        //Ajax
        json: function (url, data, success) {
            var that = this;
            data = data || {};
            url = contextPath + '/person/add';
            data = JSON.stringify(data);
            var contentType = 'application/json';
            return $.ajax({
                type: 'post',
                dataType: 'json',
                data: data,
                url: url,
                async: false,//默认为true
                contentType: contentType,
                success: function (res) {
                    if (res.status === 0) {
                        success && success(res);
                    } else {
                        layer.msg(res.msg || res.code, {shift: 6});
                    }
                }, error: function (e) {
                    layer.msg('内容有误！', {shift: 6});
                }
            });
        }
        , form: {}
    }
    form.on('submit(add_person)', function (data) {
        var action = $(data.form).attr('action'), button = $(data.elem);
        gather.json(action, data.field, function (res) {
            var end = function () {
                if (res.action) {
                    location.href = res.action;
                } else {
                    gather.form[action || button.attr('key')](data.field, data.form);
                }
            };
            if (res.status == 0) {
                button.attr('alert') ? layer.alert(res.msg, {
                    icon: 1,
                    time: 10 * 1000,
                    end: end
                }) : end();
            }
            ;
        });
        return false;
    });
    //监听提交
    /*form.on('submit(add_person)', function(data){
     layer.msg(JSON.stringify(data.field));
     return false;
     $.ajax({
     type: 'post',
     data: data,
     url: '/person/add',
     async: false,//默认为true
     contentType: contentType,//默认为application/x-www-form-urlencoded
     dataType: 'json',//默认为预期服务器返回的数据类型
     processData: false,//默认为true*!/
     success: function (data) {
     showMessage("success", "操作成功");
     },
     error: function (data) {
     showExceptionTip(data);
     }
     });
     });*/





})