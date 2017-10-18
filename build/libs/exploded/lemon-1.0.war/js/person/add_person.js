/**
 * Created by jyj on 2017/8/18.
 */

layui.use(['layer', 'form', 'element'], function () {
    var layer = layui.layer
        , form = layui.form
        , element = layui.element
        , $ = layui.jquery


  /*  var test = (function (a) {
        this.a = a;
        console.log("222222222:" + a);
        return function (b) {
            console.log("4444444:" + b);
            return this.a + b;
        }
    }(function (a, b) {
        console.log("555:" + a);
        console.log("666666:" + b)
        return a;

    }(1, 2)));

    console.log("11111111111:" + test(4));

    var a = Array(100).join(",").split(",").map(function (item, index) {
        return index;
    });

    console.log("a:" + a);
    console.log("a的长度:" + a.length);

    var a = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
        sign = 1;
    a.sort(function (a, b) {
        //因为Math.random产生的数在0-1之间
        //所以0.5两边的概率是相等的
        //大于0.5时为升序，小于0.5时为降序
        sign = (Math.random() > 0.5) ? 1 : -1;
        return (a - b) * sign;

    });

    console.log("a:" + a);*/

/*
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
    });*/


    form.on('submit(add_person)', function (data) {
        console.log("data:" + data.data);
        var param = data;
        HttpUtils.post_performer_data(param,function (data) {
            if(data.data.status = 200){
                layer.msg("data:"+data);
            }
        })
    })


})