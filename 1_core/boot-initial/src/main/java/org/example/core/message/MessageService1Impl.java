package org.example.core.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("messageService1")
public class MessageService1Impl implements MessageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageService1Impl.class);

    private String name;

    @Override
    public String sayHello() {
        LOGGER.info("Called sayHello");
        return String.format("Hello, %s!", getName());
    }

    public void init() {
        LOGGER.info("MessageImpl initialized with name: {}", name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
