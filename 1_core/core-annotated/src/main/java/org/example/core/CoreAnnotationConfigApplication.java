package org.example.core;

import org.example.core.message.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CoreAnnotationConfigApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example.core");

        MessageService messageService1 = (MessageService) context.getBean("messageService1");
        String msg = messageService1.sayHello();
        System.out.println(msg);

        MessageService messageService2 = (MessageService) context.getBean("messageService2");
        msg = messageService2.sayHello();
        System.out.println(msg);
    }

}
