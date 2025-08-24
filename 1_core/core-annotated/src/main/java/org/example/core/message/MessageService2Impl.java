package org.example.core.message;

import org.example.core.time.CurrentTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("messageService2")
public class MessageService2Impl implements MessageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageService2Impl.class);

    private Name name;
    private final ObjectFactory<CurrentTime> currentTime;

    public MessageService2Impl(@Autowired ObjectFactory<CurrentTime> currentTime) {
        this.currentTime = currentTime;
    }

    @Override
    public String sayHello() {
        LOGGER.info("Called sayHello");
        return String.format("Hello, %s!", getName().getValue());
    }

    @Override
    public String sayHelloWithTime() {
        LOGGER.info("Called sayHello");
        return String.format("Hello, %s on %s!", getName().getValue(), currentTime.getObject().getCurrentTime());
    }

    public void init() {
        LOGGER.info("MessageImpl initialized with name: {}", name);
    }

    @Autowired
    public void setName(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
