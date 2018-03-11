package com.zhangqie.dagger.demo3.module;


import com.zhangqie.dagger.demo3.Demo3Activity;
import com.zhangqie.dagger.demo3.bean.CommodityInfo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhangqie on 2018/3/10.
 */


@Module  //这是一个提供数据的【模块】
public class Demo3Module {

    private Demo3Activity demo3Activity;

    public Demo3Module(Demo3Activity activity){
        this.demo3Activity = activity;
    }
    @Provides
    CommodityInfo provideCommodityInfo(){
        return new CommodityInfo();
    }

}
