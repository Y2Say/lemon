<%--
  Created by IntelliJ IDEA.
  User: jyj
  Date: 2017/8/23
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../layout/include.jsp" %>
<div class="layui-main">
<div class="layui-upload">
    <button type="button" class="layui-btn" id="test002">多图片上传1</button>
        <div class="layui-upload-list" id="demo002"></div>
</div>

</div>
<script>
    layui.use('upload', function(){
        var $ = layui.jquery
            ,upload = layui.upload;

        //多图片上传
        upload.render({
            elem:'#test002',
            url:'/upload/',
            multiple:true,
            before:function (obj) {
                //预读本地文件示例
                obj.preview(function(index,file,result){
                    $('#demo002').append('<img src="'+result+'" alt="'+file.name+'" class="layui-upload-img"  style="width: 100px;height: 100px;border-radius: 50%;"/>')
                });
            }
            ,done:function (res) {
                //上传完毕
            }
        })



        //多文件列表示例
        var demoListView = $('#demoList')
            ,uploadListIns = upload.render({
            elem: '#testList'
            ,url: '/upload/'
            ,accept: 'file'
            ,multiple: true
            ,auto: false
            ,bindAction: '#testListAction'
            ,choose: function(obj){
                var files = obj.pushFile(); //将每次选择的文件追加到文件队列
                //读取本地文件
                obj.preview(function(index, file, result){
                    var tr = $(['<tr id="upload-'+ index +'">'
                        ,'<td>'+ file.name +'</td>'
                        ,'<td>'+ (file.size/1014).toFixed(1) +'kb</td>'
                        ,'<td>等待上传</td>'
                        ,'<td>'
                        ,'<button class="layui-btn layui-btn-mini demo-reload layui-hide">重传</button>'
                        ,'<button class="layui-btn layui-btn-mini layui-btn-danger demo-delete">删除</button>'
                        ,'</td>'
                        ,'</tr>'].join(''));

                    //单个重传
                    tr.find('.demo-reload').on('click', function(){
                        obj.upload(index, file);
                    });

                    //删除
                    tr.find('.demo-delete').on('click', function(){
                        delete files[index]; //删除对应的文件
                        tr.remove();
                    });

                    demoListView.append(tr);
                });
            }
        });
        var demoListViews = $('#demoList'),
            uploadListIn=upload.render({
                elem:'#testList',
                url:'/upload/',
                accept:'file',
                multiple:true,
                auto:false,
                bindAction:'#testListAction',
                choose:function (obj) {


                }
            })

        //绑定原始文件域
        upload.render({
            elem: '#test20'
            ,url: '/upload/'
            ,done: function(res){
                console.log(res)
            }
        });

    });
</script>

