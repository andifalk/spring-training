package org.example.core.time;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Scope(SCOPE_PROTOTYPE)
@Component
public class CurrentTimeImpl implements CurrentTime {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private final java.time.LocalDateTime localDateTime;

    public CurrentTimeImpl() {
        this.localDateTime = LocalDateTime.now();
    }

    @Override
    public String getCurrentTime() {
        return formatter.format(localDateTime);
    }
}
