package com.wangcc.codegenplugin.utils;

import org.apache.commons.lang3.StringUtils;

public class ParamCheckUtil {

    public static void assertNotNull(Object obj, String msg) {
        if (obj == null) {
            throw new RuntimeException(msg);
        }
    }

    public static void assertNull(Object obj, String msg) {
        if (obj != null) {
            throw new RuntimeException(msg);
        }
    }

    public static void assertNotBlank(String obj, String msg) {
        if (StringUtils.isBlank(obj)) {
            throw new RuntimeException(msg);
        }
    }

    public static void assertBlank(String obj, String msg) {
        if (StringUtils.isNotBlank(obj)) {
            throw new RuntimeException(msg);
        }
    }

    public static boolean isLeagel(Number number) {
        return number != null && number.intValue() > 0;
    }

    public static void checkLeagel(Number number, String errmsg) {
        if (!isLeagel(number)) {
            throw new RuntimeException(errmsg);
        }
    }

    public static void checkWithLength(String text, String blankErrmsg, int maxLength, String overflowLengtherrmsg) {
        assertNotBlank(text, blankErrmsg);
        if (text.length() > maxLength) {
            throw new RuntimeException(overflowLengtherrmsg);
        }
    }
}
