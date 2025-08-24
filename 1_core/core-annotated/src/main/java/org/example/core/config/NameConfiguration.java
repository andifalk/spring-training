package org.example.core.config;

import org.example.core.message.Name;
import org.example.core.message.NameImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NameConfiguration {

    @Bean
    public Name name() {
        return new NameImpl("Spring Annotation World");
    }

}
