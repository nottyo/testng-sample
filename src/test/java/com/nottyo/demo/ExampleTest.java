package com.nottyo.demo;

import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ExampleTest {

    @Test(description = "Test Something Success")
    public void testSomethingSuccess() {
        assertThat("1+2 = 3", 1+2, is(equalTo(3)));
    }

    @Test(description = "Another Success")
    public void testAnotherSuccess() {
        assertThat("2*3 = 6", 2*3, is(equalTo(6)));
    }

    @Test(description = "Fail Success")
    public void testSomethingFailure() {
        assertThat("10/3 = 1", 10%3, is(equalTo(2)));
    }

}
