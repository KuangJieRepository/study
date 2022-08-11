package com.kj.pattern.桥接模式;

public class Client {
    public static void main(String[] args) {
        OperatingSystemVersion os = new Windows(new AVIFile());
        os.play("战狼3");
    }
}