package org.example.pojo;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import javax.security.auth.DestroyFailedException;

/**
 * @Author: kj
 * @Date: 2022/08/29/11:47
 */
@Data
public class Person implements InitializingBean, DisposableBean, BeanNameAware, ApplicationContextAware {
    private String name;
    private int age;
    private String beanName;

    /**
     * 初始化，后置处理器，前置方法执行完执行
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("获取aware 资源的接口，一定都是在 初始化之前执行完毕，可以在初始化时，放心调用");
        System.out.println(beanName);
        System.out.println(4);
    }

    /**
     * 销毁前执行
     */
    @Override
    public void destroy() throws DestroyFailedException {
        System.out.println(7);
    }


    /**
     * 在 afterPropertiesSet  之后
     */
    public void init() {
        System.out.println(5);
    }

    /**
     * 配置文件指定的，在 DisposableBean 接口后执行
     */
    public void dest() {
        System.out.println(8);
    }

    /**
     * 获取aware 资源的接口，一定都是在 初始化之前执行完毕，可以在初始化时，放心调用
     */
    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
    }
}
