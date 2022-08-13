package com.kj.pattern.命令模式;

/**
 * 抽象命令类（Command）角色： 定义命令的接口，声明执行的方法。
 * 定义为抽象的，方便后期进行命令的拓展，只需要新建一个实现类就可以完成新的命令功能的拓展，符合开闭原则
 *
 * @author kj
 */
public interface Command {
    /**
     * 只需要定义一个统一的执行方法
     */
    void execute();
}