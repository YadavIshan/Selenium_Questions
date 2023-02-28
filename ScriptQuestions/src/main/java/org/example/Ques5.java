package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ques5 {
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
        driver.get("http://localhost:8082/Department_Management/login.jsp");
        WebElement UN = driver.findElement(By.id("username"));
        if (UN.isEnabled()) {
            System.out.println("Username text box is enabled");
        }else {
            System.out.println("Username text box is disabled");
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
    }
}
