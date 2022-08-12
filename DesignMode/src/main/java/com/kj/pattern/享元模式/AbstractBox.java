package com.kj.pattern.享元模式;

/**
 * @author kuangjie
 */
public abstract class AbstractBox {
    protected abstract String getShape();

    public void display(String color) {
        System.out.println("方块形状：" + this.getShape() + " 颜色：" + color);
    }
}
