package com.hancai.springboot.java8.builder;

import com.hancai.springboot.SpringbootApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author diaohancai
 */
public class BuilderTest extends SpringbootApplicationTests {

    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * builder模式，链式编程
     */
    @Test
    public void testBuilder() {
        /*
         * 链式编程，是为了解决当一个对象有多个属性值，
         * 且构造对象的时候，属性允许随意组合。
         * 这种情形，给对象预先设置好所有的属性组合构造器很不方便，
         * builder模式，链式编程就允许构建一个对象的时候，允许任意的属性组合进行构造对象
         */
        Product product = new Product.Builder()
                .id(1)
                .name("java8")
                .type("code")
                .price(999999999)
                .build();
        Assert.assertEquals(1, product.getId());

        logger.info(product.toString());
    }

}
