package org.example.core.config;

import org.example.core.message.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MessageConfiguration {

    @Primary
    @Bean
    public MessageService messageService1() {
        MessageService1Impl messageService1Impl = new MessageService1Impl();
        messageService1Impl.setName("Spring XML World");
        return messageService1Impl;
    }

    @Bean
    public MessageService messageService2(Name name) {
        MessageService2Impl messageService2Impl = new MessageService2Impl();
        messageService2Impl.setName(name);
        return messageService2Impl;
    }

    @Bean
    public Name name() {
        return new NameImpl("Spring XML World");
    }

}
