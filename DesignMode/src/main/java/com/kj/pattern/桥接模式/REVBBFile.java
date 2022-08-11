package com.kj.pattern.桥接模式;

/**
 * 具体实现化（Concrete Implementor）角色 ：给出实现化角色接口的具体实现。
 */
public class REVBBFile implements VideoFile {

    public void decode(String fileName) {
        System.out.println("rmvb文件：" + fileName);
    }
}