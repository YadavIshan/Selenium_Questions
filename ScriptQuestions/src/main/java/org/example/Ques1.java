package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ques1 {

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
        WebElement unTB = driver.findElement(By.id("email"));
        int username_width = unTB.getSize().getWidth();
        System.out.println(username_width);
        WebElement mobileNumTB =driver.findElement(By.xpath("//*[@id=\"email\"]"));
        int mobNumWidth = mobileNumTB.getSize().getWidth();
        System.out.println(mobNumWidth);
        if (username_width==mobNumWidth) {
            System.out.println("Size of Both username and password fields are same"
                    +username_width+" = " + mobNumWidth);
        }else{
            System.out.println("Size of username and password fields are NOT same that is :" +username_width+" Not equals to " + mobNumWidth);
            Thread.sleep(5000);
            driver.quit();
        }}

}
