package org.example.core;

import org.example.core.message.Name;
import org.example.core.message.NameImpl;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NameTest {

    @Test
    public void testNameImpl() {
        Name name = new NameImpl("World");
        assertThat(name.getValue()).isEqualTo("World");
    }
}
