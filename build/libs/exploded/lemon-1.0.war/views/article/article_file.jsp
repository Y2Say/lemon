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
    .content_style{
        margin:30px !important;
        height:auto;
    }
</style>
<div class="layui-main content_style">

    <div class="layui-upload">
        <button type="button" class="layui-btn" id="testList">选择多文件列表</button>
        <div class="layui-upload-list">
            <table class="layui-table">
                <thead>
                <tr>
                    <th>图片</th>
                    <th>文件名</th>
                    <th>大小</th>
                    <th>状态</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody id="demoList"></tbody>
            </table>
        </div>
        <button type="button" class="layui-btn" id="testListAction">开始上传</button>
    </div>
</div>
<script>
    layui.config({
        base: "${ctx}/js/"
    }).use(['upload','jquery'], function(){
        var $ = layui.$,
            upload = layui.upload;

        //多文件列表示例
        var demoListView = $('#demoList')
            ,uploadListIns = upload.render({
            elem: '#testList'
            ,url: '${ctx}/upload_list/'
            ,accept: 'files'
            ,multiple: true
            ,auto: false
            ,bindAction: '#testListAction'
            ,choose: function(obj){
                var files = obj.pushFile(); //将每次选择的文件追加到文件队列
                //读取本地文件
                obj.preview(function(index, file, result){
                    var tr = $(['<tr id="upload-'+ index +'">'
                        ,'<td>' + '<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img" width="50px" height="50px">' + '</td>'
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
                  /*  tr.find('.demo-delete').on('click', function(){
                        delete files[index]; //删除对应的文件
                        tr.remove();
                    });*/
                    demoListView.append(tr);
                });

               /* var form_data = new FormData();
                if(files && files.length>0){
                    $.each(param.files,function(k,info_name){
                        form_data.append('files',document.getElementById(info_name).files[0])
                    })
                }*/
            }
            ,done: function(data, index, upload){
                if(data.status == 200){ //上传成功
                    var tr = demoListView.find('tr#upload-'+ index)
                        ,tds = tr.children();
                    tds.eq(3).html('<span style="color: #5FB878;">上传成功</span>');
                    tds.eq(4).html(''); //清空操作
//                    delete files[index]; //删除文件队列已经上传成功的文件
                    return;
                }
                this.error(index, upload);
            }
            ,error: function(index, upload){
                var tr = demoListView.find('tr#upload-'+ index)
                    ,tds = tr.children();
                tds.eq(2).html('<span style="color: #FF5722;">上传失败</span>');
                tds.eq(3).find('.demo-reload').removeClass('layui-hide'); //显示重传
            }
        });
    });
</script>

<%--
form.on("submit(article_show)", function (data) {
var formData = new FormData();

formData.append('requestBean', new Blob([JSON.stringify({
"title": $("[name = title]").val(),
"author": $("[name = author]").val(),
"style": $("[name=style]").val(),
"content": $("[name=content]").val()
})], {
type: "application/json"
}));
formData.append("files", $("#fileimg")[0].files[0]);
formData.append("files", $("#filecidno")[0].files[0]);
$.ajax({
url: '${ctx}/article/add',
type: 'post',
async: false,
data: ,
success: function (data) {
console.log("data2:"+data.data);
if (data.status == 200) {
common.cmsLaySucMsg("文章新增成功！");
location.href = '${ctx}/views/article/article_list.jsp';
} else {
common.cmsLayErrorMsg(data.data.localMessage);
}
}, error: function (data) {

}
});
return false;
});--%>
