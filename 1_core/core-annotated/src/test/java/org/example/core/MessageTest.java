package org.example.core;

import org.example.core.message.MessageService1Impl;
import org.example.core.message.MessageService2Impl;
import org.example.core.message.NameImpl;
import org.example.core.time.CurrentTimeImpl;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MessageTest {

    @Test
    public void testMessageServiceImpl1() {
        MessageService1Impl messageService = new MessageService1Impl(new CurrentTimeImpl());
        assertThat(messageService.sayHello()).isEqualTo("Hello, Spring Annotation World!");
    }

    @Test
    public void testMessageServiceImpl2() {
        MessageService2Impl messageService = new MessageService2Impl(CurrentTimeImpl::new);
        messageService.setName(new NameImpl("World"));
        assertThat(messageService.sayHello()).isEqualTo("Hello, World!");
    }

}
