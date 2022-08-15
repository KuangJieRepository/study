package com.kj.pattern.备忘录模式.黑箱;

/**
 * 角色状态管理者类
 * 由于这个接口仅仅是一个标识接口，因此负责人角色不可能改变这个备忘录对象的内容
 */
public class RoleStateCaretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}