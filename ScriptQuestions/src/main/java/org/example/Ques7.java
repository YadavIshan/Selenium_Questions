package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ques7 {
    public static void main(String[] args){
        WebDriver driver = null;
        WebDriverManager.chromedriver().version("110.0.5481.30").setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("enable-automation");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation");
        options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);
        driver.get("http://www.google.com");

        String title = driver.getTitle();
        System.out.println(title);
        //validation point:
        if(title.equals("Google")){
            System.out.println("correct title");
        }
        else{
            System.out.println("in-correct title");
        }
        System.out.println(driver.getCurrentUrl());

        driver.quit(); //quit the browser
    }
}
