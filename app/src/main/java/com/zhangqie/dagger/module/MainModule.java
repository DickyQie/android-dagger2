package com.zhangqie.dagger.module;

import com.zhangqie.dagger.moger.Cloth;
import com.zhangqie.dagger.moger.Clothes;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/3/10.
 */


@Module
public class MainModule {

    @Provides
    public Cloth getCloth(){
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }

    @Provides
    public Clothes getClothes(Cloth cloth){
        return new Clothes(cloth);
    }


    /***
     * 同一个方法提供不同的值
     * @return
     */
    @Provides
    @Named("red")
    public Cloth getRedCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }
    @Provides
    @Named("blue")
    public Cloth getBlueCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("蓝色");
        return cloth;
    }


}
