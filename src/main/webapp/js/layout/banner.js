/**
 * Created by jyj on 2017/8/24.
 */

layui.use(['layer', 'element', 'jquery', 'tree'], function () {
    var layer = layui.layer
        , element = layui.element() //导航的hover效果、二级菜单等功能，需要依赖element模块
        , jq = layui.jquery


//头部菜单切换
    jq('.top-nav-container .layui-nav-item').click(function () {
        var menu_index = jq(this).index('.top-nav-container .layui-nav-item');
        jq('.top-nav-container .layui-nav-item').removeClass('layui-this');
        jq(this).addClass('layui-this');
        jq('.left_menu_ul').addClass('layui-hide');
        jq('.left_menu_ul:eq(' + menu_index + ')').removeClass('layui-hide');
        jq('.left_menu_ul .layui-nav-item').removeClass('layui-this');
        jq('.left_menu_ul:eq(' + menu_index + ')').find('.first-item').addClass('layui-this');
        var url = jq('.left_menu_ul:eq(' + menu_index + ')').find('.first-item a').attr('href');
        jq('.admin-iframe').attr('src', url);
//出现遮罩层
        jq("#iframe-mask").show();
//遮罩层消失
        jq("#admin-iframe").load(function () {
            jq("#iframe-mask").fadeOut(100);
        });
    });
//左边菜单点击
    jq('.left_menu_ul .layui-nav-item').click(function () {
        jq('.left_menu_ul .layui-nav-item').removeClass('layui-this');
        jq(this).addClass('layui-this');
//出现遮罩层
        jq("#iframe-mask").show();
//遮罩层消失
        jq("#admin-iframe").load(function () {
            jq("#iframe-mask").fadeOut(100);
        });
    });

//点击回到内容页面
    jq('.content_manage_title').click(function () {
        jq('.left_menu_ul .layui-nav-item').removeClass('layui-this');
        jq(this).parent().addClass('hide');
        jq('.content_put_manage').find('.first-item').addClass('layui-this');
        var url = jq('.content_put_manage').find('.first-item a').attr('href');
        jq('.admin-iframe').attr('src', url);
        jq('.content_put_manage').removeClass('hide');

    });
//内容管理树
    jq('.content_manage').click(function () {
        loading = layer.load(2, {
            shade: [0.2, '#000'] //0.2透明度的白色背景
        });
        jq.getJSON('/admin/category/manage_tree.html', function (data) {
            jq('#content_manage_tree').empty();
            layui.tree({
                elem: '#content_manage_tree' //传入元素选择器
                , skin: 'white'
                , target: 'main'
                , nodes: data
            });
            jq('.left_menu_ul').addClass('hide');
            jq('.content_manage_container').removeClass('hide');
            layer.close(loading);
        });
    });

//更新缓存
    /*jq('.update_cache').click(function () {
        loading = layer.load(2, {
            shade: [0.2, '#000'] //0.2透明度的白色背景
        });
        jq.getJSON('/admin/cache/update.html', function (data) {
            if (data.code == 200) {
                layer.close(loading);
                layer.msg(data.msg, {icon: 1, time: 1000}, function () {
                    location.reload();//do something
                });
            } else {
                layer.close(loading);
                layer.msg(data.msg, {icon: 2, anim: 6, time: 1000});
            }
        });
    });
*/
//退出登陆
    jq('.logout_btn').click(function () {
        loading = layer.load(2, {
            shade: [0.2, '#000'] //0.2透明度的白色背景
        });
        jq.getJSON('/admin/login/logout.html', function (data) {
            if (data.code == 200) {
                layer.close(loading);
                layer.msg(data.msg, {icon: 1, time: 1000}, function () {
                    location.reload();//do something
                });
            } else {
                layer.close(loading);
                layer.msg(data.msg, {icon: 2, anim: 6, time: 1000});
            }
        });
    });

});
