package com.zhangqie.dagger.demo2.bean;

/**
 * Created by zhangqie on 2018/3/10.
 */


import javax.inject.Inject;

/***
 * 这是一个商品类
 */
public class DemoInfo {

    @Inject
    public DemoInfo(){

    }
    private String uerNikeName;
    public String getUerNikeName() {
        return uerNikeName;
    }

    public void setUerNikeName(String uerNikeName) {
        this.uerNikeName = uerNikeName;
    }

    public String showContent() {
        return "我是小张";
    }

    @Override
    public String toString() {
        return "我是类对象";
    }




}
