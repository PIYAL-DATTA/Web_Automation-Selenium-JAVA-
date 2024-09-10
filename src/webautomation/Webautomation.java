/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package webautomation;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Piyal Datta
 */
public class Webautomation {

    /**
     * @param args the command line arguments
     */
    static void myMethod(String fname) throws InterruptedException {

        // Chromedriver setup
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://manobkantha.com.bd/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText(fname)).click();
        Thread.sleep(1000);
        driver.quit();
    }

    static void navbar() throws InterruptedException {
        // Chromedriver setup
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://manobkantha.com.bd/");
        driver.manage().window().maximize();

        System.out.println("NAVBAR");
        List<WebElement> nav_list = driver.findElements(By.id("start-main"));
        String navbar_list = "";
        for (WebElement element : nav_list) {
            navbar_list = element.getText();
        }
        String[] navs = navbar_list.split("\n");
        for (String nav : navs) {
            
            myMethod(nav);
        }
        driver.quit();
    }

    static void topnews() throws InterruptedException {
        // Chromedriver setup
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://manobkantha.com.bd/");
        driver.manage().window().maximize();

        System.out.println("TOPNEWS");
        List<WebElement> topnews_list = driver.findElements(By.className("card-list"));
        String topnews = "";
        for (WebElement element : topnews_list) {
            topnews = element.getText();
        }

        String[] top_news = topnews.split("\n");
        for (String news : top_news) {
            if (news.charAt(news.length() - 1) == ' ') {
                news = news.substring(0, news.length() - 1);
                myMethod(news);
            } else {
                myMethod(news);
            }
        }
        driver.quit();
    }

    static void sidebar_cross_button() throws InterruptedException {
        // Chromedriver setup
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://manobkantha.com.bd/");
        driver.manage().window().maximize();

        System.out.println("sidebar_cross_button");
        driver.findElement(By.id("showStartPushSecond")).click();
        driver.findElement(By.id("back-menu")).click();
        driver.quit();
    }

    static void home() throws InterruptedException {
        // Chromedriver setup
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://manobkantha.com.bd/");
        driver.manage().window().maximize();

        System.out.println("home");
        driver.findElement(By.id("main-logo")).click();
        driver.quit();
    }

    static void utmost() throws InterruptedException {
        // Chromedriver setup
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://manobkantha.com.bd/");
        driver.manage().window().maximize();

        System.out.println("utmost");
        List<WebElement> utmost_list = driver.findElements(By.id("home"));
        String utmost_all = "";
        for (WebElement element : utmost_list) {
            utmost_all = element.getText();
        }
        String[] utmost_news = utmost_all.split("\n");
        for (String news : utmost_news) {
            myMethod(news);
        }
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        for (int i = 0; i < 8; i++) {
            switch (i) {
                case 0:
                    myMethod("ই-পেপার");     // For E-Paper
                    break;
                case 1:
                    myMethod("কনভার্টার");   // For Converter
                    break;
                case 2:
                    myMethod("আর্কাইভ");     // For Archive
                    break;
                case 3:
                    navbar();                // Checking Navbar + All Nav Links
                    break;
                case 4:
                    topnews();               // Checking All Top-News Links
                    break;
                case 5:
                    sidebar_cross_button();  // Checking Sidebar & Cross Button
                    break;
                case 6:
                    utmost();                // Checking All Sorbo-ses News
                    break;
                case 7:
                    home();                  // Manobkontho ICON works as
                    break;                   // Homelink or Home Button

            }
        }
    }
}
