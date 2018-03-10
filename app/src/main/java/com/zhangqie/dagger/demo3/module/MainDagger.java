package com.zhangqie.dagger.demo3.module;

import com.zhangqie.dagger.demo3.bean.DemoInfo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/3/10.
 */


@Module
public class MainDagger {

    @Provides
    public DemoInfo getCloth() {
        DemoInfo cloth = new DemoInfo();
        cloth.setUerNikeName("我的名称");
        return cloth;
    }

}
