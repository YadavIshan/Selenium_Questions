package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ques13 {
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
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.findElement(By.name("proceed")).click();
        Thread.sleep(5000);

        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());

        String text = alert.getText();

        if(text.equals("Please enter a valid user name")){
            System.out.println("correct alert messg");
        }
        else{
            System.out.println("in-correct alert messg");
        }

        alert.accept();


        driver.quit(); //quit the browser
    }
}
