package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ques3 {
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
        driver.get("http://localhost:8082/Department_Management/login.jsp");
        WebElement KeepMeLogIN_Checkbox =driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/label"));
        Thread.sleep(2000);
        KeepMeLogIN_Checkbox.click();
        if (KeepMeLogIN_Checkbox.isSelected()) {
            System.out.println("Checkbox is selected");
        }else{
            System.out.println("Checkbox is NOT selected");
        }

        Thread.sleep(2000);
        driver.close();
    }
}
