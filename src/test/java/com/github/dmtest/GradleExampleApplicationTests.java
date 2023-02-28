package com.github.dmtest;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class GradleExampleApplicationTests {

    @Test
    @DisplayName("My test1")
    public void test1() {
        log.info("Hi, failed test!");
        Assertions.fail();
    }

    @Test
    @DisplayName("My test2")
    public void test2() {
        log.debug("Hi, success test, level DEBUG!");
        log.info("Hi, success test, level INFO!");
    }

}
