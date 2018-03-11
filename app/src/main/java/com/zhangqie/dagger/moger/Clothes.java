package com.zhangqie.dagger.moger;

/**
 * Created by zhangqie on 2018/3/10.
 */

public class Clothes {

    private Cloth cloth;

    public Clothes(Cloth cloth) {
        this.cloth = cloth;
    }

    public Cloth getCloth() {
        return cloth;
    }

    @Override
    public String toString() {
        return cloth.getColor() + "衣服";
    }

}
