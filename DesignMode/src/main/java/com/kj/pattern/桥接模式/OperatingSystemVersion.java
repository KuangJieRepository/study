package com.kj.pattern.桥接模式;

/**
 * 抽象化（Abstraction）角色 ：定义抽象类，并包含一个对实现化对象的引用
 */
public abstract class OperatingSystemVersion {


    /**
     * 内部聚合另一个维度的抽象
     */
    protected VideoFile videoFile;

    public OperatingSystemVersion(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}