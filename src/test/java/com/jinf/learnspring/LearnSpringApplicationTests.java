package com.jinf.learnspring;

import com.jinf.learnspring.bean.PersonContainer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author jinfeng
 * @since 2022/3/21 22:01
 */
@SpringBootTest
public class LearnSpringApplicationTests implements ApplicationContextAware {

    @Test
    void test() throws IOException {

    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //BeanFactory bean = applicationContext.getBean(DefaultListableBeanFactory.class);
        PersonContainer bean = applicationContext.getBean(PersonContainer.class);
        BeanFactory beanFactory = bean.getBeanFactory();
        System.out.println();
        //applicationContext

        try {
            int read = System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(bean);
    }
}
