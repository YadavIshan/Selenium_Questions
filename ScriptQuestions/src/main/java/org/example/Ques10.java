package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Ques10 {
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
        driver.get(" http://www.google.com ");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("selenium");
        Thread.sleep(2000);
        List<WebElement> allOptions =driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
        int count = allOptions.size();
        System.out.println("Number of values present in the dropdown is : " + count);
        String expectedValue="selenium interview questions";
        for (WebElement option : allOptions) {
            String text = option.getText();
            System.out.println(" "+text);
            //Click on Java Interview Questions
            if (text.equalsIgnoreCase(expectedValue)) {
                option.click();
                break;
            }
        }
    }
}
