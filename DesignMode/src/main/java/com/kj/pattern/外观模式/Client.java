package com.kj.pattern.外观模式;

/**
 *  只需要访问外观类，就可以简单的使用子系统，无需自己熟知每个子系统的功能
 * @author kuangjie
 */
public class Client {
    public static void main(String[] args) {
        //创建外观对象
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        //客户端直接与外观对象进行交互
        facade.say("打开家电");
        facade.say("关闭家电");
    }
}