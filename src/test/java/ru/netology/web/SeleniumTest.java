package ru.netology.web;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SeleniumTest {

    @BeforeAll
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","driver/win/chromedriver.exe");
    }


}
