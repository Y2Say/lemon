package com.lemon.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

/**
 * Created by lemon on 2017/8/16.
 */
public class HttpResponseHelper {
    private static final Logger log = LogManager.getLogger(HttpResponseHelper.class);

    private HttpResponseHelper() {
    }

    public static String inbox(HashMap<String, Object> errorsHash) {
        ObjectMapper mapper = new ObjectMapper();
        CustomerHttpResponseStruct customerHttpResponseStruct = new CustomerHttpResponseStruct();
        customerHttpResponseStruct.setStatus(500);
        customerHttpResponseStruct.setMessage("exception");
        customerHttpResponseStruct.setData(errorsHash.get("errors"));
        String returnString = null;

        try {
            returnString = mapper.writeValueAsString(customerHttpResponseStruct);
        } catch (JsonProcessingException var5) {
            log.error(var5.getMessage(), var5);
        }

        if(log.isDebugEnabled()) {
            log.debug("装箱成功，返回的json字符串是:{}", returnString);
        }

        return returnString;
    }

    public static String successInfoInbox(String dataString) {
        HashMap hashMap = new HashMap();
        hashMap.put("localMessage", dataString);
        return successInfoInbox(hashMap);
    }

    public static String successInfoInbox(HashMap<String, Object> successMessageHash) {
        CustomerHttpResponseStruct customerHttpResponseStruct = new CustomerHttpResponseStruct();
        ObjectMapper mapper = new ObjectMapper();
        customerHttpResponseStruct.setStatus(200);
        customerHttpResponseStruct.setMessage("success");
        customerHttpResponseStruct.setSuccess(true);
        customerHttpResponseStruct.setData(successMessageHash);
        String returnString = null;

        try {
            returnString = mapper.writeValueAsString(customerHttpResponseStruct);
        } catch (JsonProcessingException var5) {
            log.error(var5.getMessage(), var5);
        }

        return returnString;
    }
}
