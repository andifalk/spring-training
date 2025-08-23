package org.example.core;

import org.example.core.config.MessageConfiguration;
import org.example.core.message.MessageService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.assertj.core.api.Assertions.assertThat;

@SpringJUnitConfig(classes = MessageConfiguration.class)
class CoreJavaConfigApplicationTests {

    @Autowired
    private ApplicationContext context;

    @Test
    void contextLoads() {
        MessageService messageServiceBean1 = (MessageService) context.getBean("messageService1");
        assertThat(messageServiceBean1)
                .isNotNull()
                .extracting(MessageService::sayHello)
                .isEqualTo("Hello, Spring XML World!");

        MessageService messageServiceBean2 = (MessageService) context.getBean("messageService2");
        assertThat(messageServiceBean2)
                .isNotNull()
                .extracting(MessageService::sayHello)
                .isEqualTo("Hello, Spring XML World!");
    }

    @Test
    void messageTest(@Autowired MessageService messageService) {
        String msg = messageService.sayHello();
        assertThat(msg).isEqualTo("Hello, Spring XML World!");
    }

}
