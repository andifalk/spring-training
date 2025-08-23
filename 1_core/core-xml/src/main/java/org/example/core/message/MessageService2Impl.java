package org.example.core.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageService2Impl implements MessageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageService2Impl.class);

    private Name name;

    @Override
    public String sayHello() {
        LOGGER.info("Called sayHello");
        return String.format("Hello, %s!", getName().getValue());
    }

    public void init() {
        LOGGER.info("MessageImpl initialized with name: {}", name);
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
