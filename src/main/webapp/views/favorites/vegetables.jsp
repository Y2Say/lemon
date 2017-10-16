<%--
  Created by IntelliJ IDEA.
  User: jyj
  Date: 2017/8/23
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="<%=request.getContextPath()%>/css/favorites/article.css" rel="stylesheet" />

<script src="<%=request.getContextPath()%>/js/favorites/article.js"></script>
<div class="title">文章列表</div>


<blockquote class="layui-elem-quote news_search">
    <div class="layui-inline">
        <div class="layui-input-inline">
            <input type="text" placeholder="请输入关键字" class="layui-input search_input"/>
        </div>
        <a class="layui-btn search_btn">查询</a>
    </div>
    <div class="layui-inline">
        <a class="layui-btn layui-btn-normal newsAdd_btn">添加文章</a>
    </div>
    <div class="layui-inline">
        <a class="layui-btn recommend" style="background-color: #5FB878">推荐文章</a>
    </div>
    <div class="layui-inline">
        <a class="layui-btn audit_btn">审核文章</a>
    </div>
    <div class="layui-inline">
        <a class="layui-btn layui-btn-danger batchDel">批量删除</a>
    </div>
</blockquote>
<div class="layui-form news_list">
    <table class="layui-table">
        <colgroup>
            <col width="50">
            <col>
            <col width="9%">
            <col width="9%">
            <col width="9%">
            <col width="9%">
            <col width="15%">
        </colgroup>
        <thead>
        <tr>
            <th><input type="checkbox" name lay-skin="primary" lay-filter="allChoose" id="allChoose">
            <div class="layui-unselect layui-form-checkbox" lay-skin="primary">
                <i class="layui-icon"></i>
            </div>
            </th>
            <th style="text-align: left">文章标题</th>
            <th>发布人</th>
            <th>审核状态</th>
            <th>浏览权限</th>
            <th>是否展示</th>
            <th>发布时间</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody class="news_content">
            <tr>
                <td><input type="checkbox" name="checked" lay-skin="primary" lay-filter="choose">
                <div class="layui-unselect layui-form-checkbox" lay-skin="primary">
                    <i class="layui-icon"></i>
                </div></td>
                <td align="left">css3动画实现</td>
                <td>css</td>
                <td>审核通过</td>
                <td>开放浏览</td>
                <td><input type="checkbox" name="show" lay-skin="switch" lay-text="是|否" lay-filter="isShow">
                <div class="layui-unselect layui-form-switch choose_style" layui-skin="_switch">
                    否
                    <i class="layui-icon"></i>
                </div>
                </td>
                <td>2017-10-16</td>
                <td>
                    <a class="layui-btn layui-btn-mini news_edit">
                        <i class="layui-icon iconfont icon-edit">&#xe642;</i>编辑
                    </a>
                    <a class="layui-btn layui-btn-mini news_del">
                        <i class="layui-icon icon-edit">&#xe640;</i>删除
                    </a>
                </td>
            </tr>
            <tr>
                <td><input type="checkbox" name="checked" lay-skin="primary" lay-filter="choose">
                    <div class="layui-unselect layui-form-checkbox" lay-skin="primary">
                        <i class="layui-icon"></i>
                    </div></td>
                <td align="left">css3动画实现</td>
                <td>css</td>
                <td>审核通过</td>
                <td>开放浏览</td>
                <td><input type="checkbox" name="show" lay-skin="switch" lay-text="是|否" lay-filter="isShow">
                    <div class="layui-unselect layui-form-switch choose_style" layui-skin="_switch">
                        是
                        <i ></i>
                    </div>
                </td>
                <td>2017-10-16</td>
                <td>
                    <a class="layui-btn layui-btn-mini news_edit">
                        <i class="layui-icon iconfont icon-edit">&#xe642;</i>编辑
                    </a>
                    <a class="layui-btn layui-btn-mini news_del">
                        <i class="layui-icon icon-edit">&#xe640;</i>删除
                    </a>
                </td>
            </tr>
            <tr>
                <td><input type="checkbox" name="checked" lay-skin="primary" lay-filter="choose">
                    <div class="layui-unselect layui-form-checkbox" lay-skin="primary">
                        <i class="layui-icon"></i>
                    </div></td>
                <td align="left">css3动画实现</td>
                <td>css</td>
                <td>审核通过</td>
                <td>开放浏览</td>
                <td><input type="checkbox" name="show" lay-skin="switch" lay-text="是|否" lay-filter="isShow">
                    <div class="layui-unselect layui-form-switch choose_style" layui-skin="_switch">
                        是
                        <i ></i>
                    </div>
                </td>
                <td>2017-10-16</td>
                <td>
                    <a class="layui-btn layui-btn-mini news_edit">
                        <i class="layui-icon iconfont icon-edit">&#xe642;</i>编辑
                    </a>
                    <a class="layui-btn layui-btn-mini news_del">
                        <i class="layui-icon icon-edit">&#xe640;</i>删除
                    </a>
                </td>
            </tr>
            <tr>
                <td><input type="checkbox" name="checked" lay-skin="primary" lay-filter="choose">
                    <div class="layui-unselect layui-form-checkbox" lay-skin="primary">
                        <i class="layui-icon"></i>
                    </div></td>
                <td align="left">css3动画实现</td>
                <td>css</td>
                <td>审核通过</td>
                <td>开放浏览</td>
                <td><input type="checkbox" name="show" lay-skin="switch" lay-text="是|否" lay-filter="isShow">
                    <div class="layui-unselect layui-form-switch choose_style" layui-skin="_switch">
                        否
                        <i ></i>
                    </div>
                </td>
                <td>2017-10-16</td>
                <td>
                    <a class="layui-btn layui-btn-mini news_edit">
                        <i class="layui-icon iconfont icon-edit">&#xe642;</i>编辑
                    </a>
                    <a class="layui-btn layui-btn-mini news_del">
                        <i class="layui-icon icon-edit">&#xe640;</i>删除
                    </a>
                </td>
            </tr>
        </tbody>
    </table>
</div>
