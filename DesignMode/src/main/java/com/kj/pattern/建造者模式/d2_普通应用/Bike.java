package com.kj.pattern.建造者模式.d2_普通应用;

/**
 * @Author: kj
 * @Date: 2022/08/09/17:29
 * 具体对象类
 */
public class Bike {
    /**
     * 车架
     */
    private String frame;
    /**
     * 车座
     */
    private String seat;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "frame='" + frame + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
