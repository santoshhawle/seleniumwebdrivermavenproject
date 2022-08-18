package seleniumbasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class TC06_WorkingWithCookies {

    public static void main(String[] args){

        /*
        Calling chromedriver static method from class WebDriverManager to setup chromedriver
        Make sure WebDriverManager dependency is added in pom.xml file
         */
        WebDriverManager.chromedriver().setup();

        //Create chromedriver instance
        WebDriver driver=new ChromeDriver();

        //maximize the browser window
        driver.manage().window().maximize();

        //open the URL
        driver.get("http://softtestautomation.in");

        //Get all cookies
        Set<Cookie> cookiesList=driver.manage().getCookies();

        //print all cookies names
        cookiesList.forEach((cookie)->{
            System.out.println(cookie.getName());
        });

        //Delete all cookies
        driver.manage().deleteAllCookies();

        //close browser all associated windows
        driver.quit();

    }

}
