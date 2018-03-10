package com.zhangqie.dagger.demo1.bean;

/**
 * Created by zhangqie on 2018/3/10.
 */


import javax.inject.Inject;

/***
 * 这是一个商品类
 */
public class CommodityInfo {

    @Inject
    public CommodityInfo (){

    }

    @Override
    public String toString() {
        return "我是商品类对象";
    }
}
