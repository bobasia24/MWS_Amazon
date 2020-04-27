package com.example.amazon.amazon.untils;

/**
 * @auther: hujun
 * @date: 2019/5/8 11:23
 * @email: 461214737@qq.com
 * @description: 亚马逊请求默认参数
 */
public interface AmazonOrder {

    /***post请求地址*/
    String POST_URL = "https://mws-eu.amazonservices.com/Orders/2013-09-01";

    /***post请求后缀*/
    String SUFFIX_POST_URL = "/Orders/2013-09-01";
    /***订单api版本*/
    String VERSION = "2013-09-01";
    /****请求的Amazon方法*/
    String ACTION = "ListOrders";
    /***签名方式*/
    String ALGORITHM = "HmacSHA256";

    /****时间转换格式*/
    String TIME_FORMAT_STR = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'Z'";

    /****编码格式*/
    String CHARACTER_ENCODING = "UTF-8";

    String SIGNATURE_VERSION ="2";
    /***订单中的所有商品均已发货*/
    String SHIPPED ="Shipped";


}