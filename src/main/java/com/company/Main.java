package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver",
                new File("./src/test/drivers/chromedriver.exe").getCanonicalPath());
        WebDriver obj = new ChromeDriver();
        obj.get("http://www.google.com");
        Thread.sleep(10000);
    }
}
