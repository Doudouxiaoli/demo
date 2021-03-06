package com.example.common.util;
import org.apache.commons.lang3.StringUtils;

/**
 * 字符串工具类
 * Created by zhl on 2019/10/25.
 */
public class StrUtils {
    /**
     * 为空
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String  str) {
        return StringUtils.isEmpty(str);
    }

    /**
     * 不为空
     *
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String  str) {
        return !StringUtils.isEmpty(str);
    }

    /**
     * 驼峰写法转为小写下划线
     * usName->us_name
     *
     * @param para
     * @return
     */
    public static String humpToUnderline(String para) {
        StringBuilder sb = new StringBuilder(para);
        int temp = 0;//定位
        if (!para.contains("_")) {
            for (int i = 0; i < para.length(); i++) {
                if (Character.isUpperCase(para.charAt(i))) {
                    sb.insert(i + temp, "_");
                    temp += 1;
                }
            }
        }
        return sb.toString().toUpperCase();
    }
}
