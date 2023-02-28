package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Ques14 {
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
        driver.get("https://www.actimind.com/");
        WebElement menu=driver.findElement(By.xpath("/html/body/header/div/div/div/nav/ul/li[2]/a"));
        Actions action=new Actions(driver);
        action.moveToElement(menu).perform();
        WebElement submenu=driver.findElement(By.xpath("/html/body/header/div/div/div/nav/ul/li[2]/ul/li/ul/li[2]/a"));
        action.moveToElement(submenu).click().perform();
        driver.quit(); //quit the browser
    }
}
