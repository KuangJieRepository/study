package com.kj.pattern.状态模式;

/**
 * @author KJ
 * @date 2022/8/14 16:49
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
