package com.aag.bamboodemo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BamboodemoApplicationTests {

    @Test
    void thisTestPasses() {
        Assert.assertEquals(2,2);
    }

    @Test
    void thisTestFails() {
        Assert.assertEquals(1,2);
    }


}
