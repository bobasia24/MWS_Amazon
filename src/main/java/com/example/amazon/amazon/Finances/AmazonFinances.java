package com.example.amazon.amazon.Finances;

public interface AmazonFinances {
    /***post请求地址*/
    String POST_URL = "https://mws-eu.amazonservices.com/Finances/2015-05-01";

    /***post请求后缀*/
    String SUFFIX_POST_URL = "/Finances/2015-05-01";
    /***订单api版本*/
    String VERSION = "2015-05-01";
    /****请求的Amazon方法*/
    String ACTION = "ListFinancialEventGroups";
    /***签名方式*/
    String ALGORITHM = "HmacSHA256";

    /****时间转换格式*/
    String TIME_FORMAT_STR = "yyyy'-'MM'-'dd'T'HH':'mm':'ss'Z'";

    /****编码格式*/
    String CHARACTER_ENCODING = "UTF-8";

    String SIGNATURE_VERSION ="2";

}
