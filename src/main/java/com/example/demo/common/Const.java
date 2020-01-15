package com.example.demo.common;

import org.springframework.mobile.device.LiteDeviceResolver;

/**
 * @author gx
 * @date 2018/11/15
 */
public class Const {

    /**
     * IM聊天每次来回聊天数量，例如：2次代表医生患者来回聊天2*20=40次
     */
    public static Integer CHATPERCOUNT = 20;

    /**
     * PC前端列表暂不分页
     */
    public static Integer WEB_PC_ROWSPERPAGE = -1;

    /**
     * 前端列表每页个数
     */
    public static Integer WEB_ROWSPERPAGE = 5;
    /**
     * 后台列表每页个数 5
     */
    public static Integer ADMIN_ROWSPERPAGE_LESS = 5;
    /**
     * 后台列表每页个数 10
     */
    public static Integer ADMIN_ROWSPERPAGE_MORE = 10;
    /**
     * 日期格式 yyyy-MM-dd 2013-06-16
     */
    public static String FORMAT_DATE = "yyyy-MM-dd";
    /**
     * 日期格式 yyyy-MM-dd HH:mm:ss 2013-06-16 09:54:02
     */
    public static String FORMAT_DATETIME = "yyyy-MM-dd HH:mm:ss";
    /**
     * 日期格式 MM-dd 06-16
     */
    public static String FORMAT_DATE_ONLY_DAY = "MM-dd";
    /**
     * 日期格式 HH:mm 09:54
     */
    public static String FORMAT_DATE_ONLY_HOUR = "HH:mm";
    /**
     * 日期格式 yyyy-MM-dd HH
     */
    public static String FORMAT_DATE_HOUR = "yyyy-MM-dd HH";
    /**
     * 日期格式 yyyy-MM-dd HH:mm
     */
    public static String FORMAT_DATE_HOUR_MINUTE = "yyyy-MM-dd HH:mm";

    /**
     * 文件存储的根目录
     */
    public static final String BASE_FOLDER = "up";
    /**
     * 默认存储本地路径
     */
    public static String PIC_PATH_DEFAULT = "up/default/pic/";
    /**
     * 微信头像路径
     */
    public static String HEADIMG_PATH = "up/headimg/";
    /**
     * 代表二维码路径
     */
    public static String QRCODE_PATH = "up/qrcode/";
    /**
     * 用户签名
     */
    public static String SIGN_PATH = "up/sign/";
    /**
     * 用户身份证+银行卡照片+签名
     */
    public static String USER_BANK_OR_IDCARD_OR_SIGN = "up/user/";

    public static String AUDIO_PATH = "up/audio/";
    public static String VIDEO_PATH = "up/video/";
    public static String FILE_PATH = "up/file/";

    /**
     * ppt源文件存放路径
     */
    public static String PPT_PATH = "up/ppt/";
    /**
     * ppt转图片存储本地路径
     */
    public static String PPT_IMG_PATH = "up/ppt/img/";
    /**
     * ppt临时存放地址
     */
    public static String PPT_FILE_PATH = "up/ppt/file/";

    /**
     * 项目相关存储本地路径 start
     */
    public static String RESOURCES_PATH = "up/resources/file/";


    /**
     * web图片存储本地路径 start
     */
    public static String PIC_PATH_INFORMATION = "up/information/pic/";//学术资讯图片存储路径
    public static String PIC_PATH_CASE = "up/case/pic/";//病例比赛图片存储路径
    public static String PIC_PATH_AUTHORITY = "up/authority/pic/";//权威之声图片存储路径
    public static String PIC_PATH_RESOURCES = "up/resources/pic/";//学术资源图片存储路径
    public static String PIC_PATH_KV = "up/Kv/pic/";//首页kv图片存储路径
    public static String PIC_PATH_SHARECODE = "up/shareCode/pic/";// 小程序分享二维码存储路径
    public static String PIC_PATH_MEETINGSTAND="up/meetingStand/pic/";//会议站图片存储路径


    /** web图片存储本地路径 end */


    /**
     * web图片存储类型 start
     */
    public static String PIC_INFORMATION_TYPE = "information";// 学术资讯
    public static String PIC_CASE_TYPE = "case";// 病例比赛
    public static String PIC_AUTHORITY_TYPE = "authority"; //权威之声
    public static String PIC_RESOURCES_TYPE = "resources"; //学术资源
    public static String PIC_KV_TYPE = "Kv"; //首页kv
    public static String PIC_MEETINGSTAND_TYPE="meetingStand";//会议站

    /**
     * web图片存储类型 end
     */

    public static String SYS_DOMAIN;
    public static String SYS_ENVIRONMENT;

    public static LiteDeviceResolver liteDeviceResolver = new LiteDeviceResolver();

    /**
     * 最新资讯使用的模板常量
     */
    public static Long MODEL_INFORMATION_ID = 0L;
    public static String MODEL_INFORMATION_TYPE = "学术资源";
    public static Long MODEL_AUTHORITY_ID = 1L;
    public static String MODEL_AUTHORITY_TYPE = "权威之声";
    public static Long MODEL_CASE_ID = 2L;
    public static String MODEL_CASE_TYPE = "病例比赛";
    public static Long MODEL_RESOURCES_ID = 3L;
    public static String MODEL_RESOURCES_TYPE = "学术资源";

}
