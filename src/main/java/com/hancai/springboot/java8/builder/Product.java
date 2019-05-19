package com.hancai.springboot.java8.builder;

import lombok.Data;
import lombok.ToString;

/**
 * builder 模式，链式编程
 *
 * @author diaohancai
 */
@Data
@ToString
public class Product {

    private int id;
    private String name;
    private String type;
    private double price;

    public Product(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.type = builder.type;
        this.price = builder.price;
    }

    /**
     * Product's Builder
     */
    public static class Builder {
        private int id;
        private String name;
        private String type;
        private double price;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

}
