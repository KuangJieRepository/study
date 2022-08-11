package com.kj.pattern.桥接模式;

/**
 * avi文件
 * 具体实现化（Concrete Implementor）角色 ：给出实现化角色接口的具体实现。
 */
public class AVIFile implements VideoFile {
    public void decode(String fileName) {
        System.out.println("avi视频文件："+ fileName);
    }
}