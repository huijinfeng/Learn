package com.jinf.learnspring.bean;

import lombok.Data;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author jinfeng
 * @since 2022/3/21 22:00
 */
//@Component
@Data
public class PersonContainer {
    @Autowired
    private BeanFactory beanFactory;
    @Autowired
    private ApplicationContext applicationContext;
}
