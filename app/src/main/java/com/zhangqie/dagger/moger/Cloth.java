package com.zhangqie.dagger.moger;

/**
 * Created by zhangqie on 2018/3/10.
 */

public class Cloth {

    private String color;
    public String getColor() { return color; }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return color + "布料";
    }







}
