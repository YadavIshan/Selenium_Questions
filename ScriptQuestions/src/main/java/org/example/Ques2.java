package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ques2 {
    public static void main(String[] args) throws InterruptedException {
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
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("Ishan");
        Thread.sleep(2000);
        String value = driver.findElement(By.id("email")).getAttribute("value");
        System.out.println("Value present inside the text box is : "+value);
        driver.findElement(By.id("email")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("Ishan-yadav");
        Thread.sleep(2000);

        driver.quit();
    }
}
