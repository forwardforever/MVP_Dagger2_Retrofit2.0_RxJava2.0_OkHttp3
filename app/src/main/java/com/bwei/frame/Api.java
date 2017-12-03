package com.bwei.frame;

/**
 * 1. 类的用途
 * 2. @author forever
 * 3. @date 2017/12/3 13:01
 */


public class Api {
   //dug为ture是测试环境 false这线上环境
    private static boolean isDug = false;
    //http://baobab.kaiyanapp.com/api/v2/categories?udid=26868b32e808498db32fd51fb422d00175e179df&vc=83
    //https://www.zhaoapi.cn/product/searchProducts?keywords=笔记本&page=1
    //测试
    public static  String onTestUrl = "https://www.zhaoapi.cn/";
    //线上
    public static  String onLineUrl = "http://baobab.kaiyanapp.com/";
    public static  String url= baseUrl()+"api/v2//";


    private static String baseUrl(){

        return isDug?onTestUrl:onLineUrl;
    }
}
