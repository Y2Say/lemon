/**
 * Created by jyj on 2017/9/13.
 */

var HttpUtils = (function () {
    /**
     * 封装基本请求方式
     */

    var application = {};
    /**
     * 基本信息提交
     */
    application.post_performer_data = function(param,callback){
        var url = '/performer/add';
        BaseRequest.post(param,url,callback);
    }


    return application;
})();
