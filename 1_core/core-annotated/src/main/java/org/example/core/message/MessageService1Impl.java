package org.example.core.message;

import org.example.core.time.CurrentTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("messageService1")
public class MessageService1Impl implements MessageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageService1Impl.class);

    private final String name;
    private final CurrentTime currentTime;

    // Wrong way - Spring won't be able to inject CurrentTime bean as a prototype into singleton bean
    public MessageService1Impl(@Autowired CurrentTime currentTime) {
        this.currentTime = currentTime;
        this.name = "Spring Annotation World";
    }

    @Override
    public String sayHello() {
        LOGGER.info("Called sayHello");
        return String.format("Hello, %s!", getName());
    }

    @Override
    public String sayHelloWithTime() {
        LOGGER.info("Called sayHelloWithTime");
        return String.format("Hello, %s on %s!", getName(), currentTime.getCurrentTime());
    }

    public void init() {
        LOGGER.info("MessageImpl initialized with name: {}", name);
    }

    public String getName() {
        return name;
    }
}
