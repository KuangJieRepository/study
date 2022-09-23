package org.example.pojo;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: kj
 * @Date: 2022/08/31/10:42
 */
public class StudentFactoryBean implements FactoryBean<Student> {
    /**
     * @return 得到的是该方法返回的对象，可以将复杂对象的创建封装起来
     */
    @Override
    public Student getObject() throws Exception {
        Student student = new Student();
        student.setName("匡杰");
        student.setAge(33);
        student.setMoney("999999");
        student.setExpression("FactoryBean");
        return student;
    }

    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }
}
