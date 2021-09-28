package ru.telegram_bot;

import org.junit.Test;

import org.junit.Assert;

public class HelloTest {

    @Test
    public void printStr() {
        String expected = "Ну все, понеслась!";
        String result  = Hello.printStr();
        Assert.assertEquals(expected, result);
    }
}