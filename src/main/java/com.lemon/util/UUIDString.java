package com.lemon.util;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by lemon on 2017/8/16.
 */
public class UUIDString {

    private UUIDString() {
    }

    public static String genShortUUID() {
        SecureRandom rand = new SecureRandom();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyHHmmssSSS");
        return sdf.format(new Date()) + Integer.toString(rand.nextInt(1000));
    }

    public static String genUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
