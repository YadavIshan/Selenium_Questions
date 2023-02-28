package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ques11 {
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
        driver.manage().window().maximize();
        driver.get("https://ui.freecrm.com/"); //enter URL
        Thread.sleep(9000);
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).sendKeys("kanakraj55266255@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")).sendKeys("Knkraj52625@");
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
        Thread.sleep(3000);

        driver.switchTo().frame("mainpanel");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/a/span")).click();
    }
}
