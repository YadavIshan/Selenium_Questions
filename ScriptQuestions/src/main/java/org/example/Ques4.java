package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Ques4 {
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
            List<WebElement> allLinks = driver.findElements(By.tagName("a"));
            //get the total number of link elements
            int totalLinks = allLinks.size();
            System.out.println("total number of links present on the web page is :"+totalLinks);
            int visibleLinkCount = 0;
            int hiddenLinkCount = 0;
            for (WebElement link : allLinks) {
                if (link.isDisplayed()) {
                    visibleLinkCount++;
                    System.out.println(visibleLinkCount+" --> "+link.getText());
                }else{
                    hiddenLinkCount++;
                }
            }
            System.out.println("Total number of visible links :" + visibleLinkCount);
            System.out.println("Total number of hidden links :" + hiddenLinkCount);
            Thread.sleep(5000);
            driver.close();
    }

}
