package com.lemon.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Created by lemon on 2017/8/16.
 */
public class JsonUtilsHelper {
    private static final Logger log = LogManager.getLogger(JsonUtilsHelper.class);
    private static ObjectMapper mapper;

    private JsonUtilsHelper() {
    }

    public static String objectToJsonString(Object obj) throws JsonProcessingException {
        return mapper.writeValueAsString(obj);
    }

    public static <T> T parseStringToObject(String jsonString, Class<T> clazz) throws JsonProcessingException {
        return JSON.parseObject(jsonString, clazz, new Feature[0]);
    }



    static {
        log.debug("JsonUtilsHelper() - start");
        mapper = new ObjectMapper();
        log.debug("JsonUtilsHelper() - end");
    }
}
