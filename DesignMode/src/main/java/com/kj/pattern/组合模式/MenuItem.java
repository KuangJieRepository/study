
package com.kj.pattern.组合模式;

/**
 * @author kj
 * 叶子节点（Leaf）：叶子节点对象，其下再无分支，是系统层次遍历的最小单位。
 */
public class MenuItem extends MenuComponent {

    public MenuItem(String name,int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 1; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}