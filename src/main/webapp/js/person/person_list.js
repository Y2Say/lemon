/**
 * Created by lemon on 2017/8/18.
 */

/*
layui.use(['layer', 'form', 'element','table'], function () {
    var layer = layui.layer
        , form = layui.form
        , element = layui.element
        ,$ = layui.jquery
        ,table = layui.table


  /!*  //监听表格复选框选择
    table.on('checkbox(test1)', function(obj){
        console.log(obj)
    });

    //监听工具条
    table.on('tool(test1)', function(obj){
        var data = obj.data;
        if(obj.event === 'detail'){
            layer.msg('ID：'+ data.id + ' 的查看操作');
        } else if(obj.event === 'del'){
            layer.confirm('真的删除行么', function(index){
                obj.del();
                layer.close(index);
            });
        } else if(obj.event === 'edit'){
            layer.alert('编辑行：<br>'+ JSON.stringify(data))
        }
    });

    var $ = layui.$, active = {
        getCheckData: function(){
            var checkStatus = table.checkStatus('test1')
                ,data = checkStatus.data;
            layer.alert(JSON.stringify(data));
        }
        ,getCheckLength: function(){
            var checkStatus = table.checkStatus('test1')
                ,data = checkStatus.data;
            layer.msg('选中了：'+ data.length + ' 个');
        }
        ,isAll: function(){
            var checkStatus = table.checkStatus('test1');
            layer.msg(checkStatus.isAll ? '全选': '未全选')
        }
        ,reload: function(){
            var demoReload = $('#demoReload');

            ins1.reload({
                where: {
                    key: {
                        id: demoReload.val()
                    }
                }
            });
        }
        ,parseTable: function(){
            table.init('parse-table-demo');
        }
    };

    $('.demoTable .layui-btn').on('click', function(){
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });*!/
    $('.btn_add_person').on('click', function () {
        location.href = contextPath + '/views/person/add_person.jsp'
    })
})*/
layui.use('table', function(){
    var table = layui.table
    ,$=layui.jquery

    $(".btn_add_person").on('click',function () {
        location.href=contextPath+'/views/person/add_person.jsp';
    })

});