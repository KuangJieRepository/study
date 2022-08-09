package com.kj.pattern.建造者模式.d1_内部构造器类;

/**
 * @Author: kj
 * @Date: 2022/08/09/17:15
 */
public class Phone {
    private String name;
    private double price;
    private String brand;

    /**
     * 构造器私有化
     */
    private Phone(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.brand = builder.brand;
    }

    /**
     * 内部构造器类
     */
    public static final class Builder {
        private String name;
        private double price;
        private String brand;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }

    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
