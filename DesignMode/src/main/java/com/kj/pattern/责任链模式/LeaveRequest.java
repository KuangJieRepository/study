package com.kj.pattern.责任链模式;

/**
 * 请假条
 *
 * @author 17601
 */
public class LeaveRequest {
    /**
     * 姓名
     */
    private String name;

    /**
     * 请假天数
     */
    private int num;

    /**
     * 请假内容
     */
    private String content;

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}