package org.example.core.message;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

public class NameImpl implements Name, InitializingBean {

    private String value;

    public NameImpl() {
    }

    public NameImpl(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Name['" + getValue() + "']";
    }

    @Override
    public void afterPropertiesSet() {
        Assert.notNull(value, "'value' is required");
    }
}
