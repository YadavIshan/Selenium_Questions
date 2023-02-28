package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class Ques9 {
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
        driver.get("http://spicejet.com/");

        sleep(4000);
        WebElement menu = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(menu).perform();
        WebElement Submenu=driver.findElement(By.linkText("Benefits"));
        Submenu.click();
        sleep(4000);
        driver.close();

    }
}
