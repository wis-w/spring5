package com.edu.tx;

import com.edu.tx.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TxTest {

    @Test
    public void bank(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:tx2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.countMoney();
    }
}
