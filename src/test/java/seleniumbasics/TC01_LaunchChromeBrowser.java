package seleniumbasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_LaunchChromeBrowser {

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

        //close browser all associated windows
        driver.quit();

    }

}
