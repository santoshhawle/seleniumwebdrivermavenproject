package seleniumbasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC03_LaunchFirefoxBrowser {

    public static void main(String[] args){

        /*
        Calling firefoxdriver static method from class WebDriverManager to setup firefoxdriver
        Make sure WebDriverManager dependency is added in pom.xml file
         */
        WebDriverManager.firefoxdriver().setup();

        //Create FirefoxDriver instance
        WebDriver driver=new FirefoxDriver();

        //maximize the browser window
        driver.manage().window().maximize();

        //open the URL
        driver.get("http://softtestautomation.in");

        //close browser all associated windows
        driver.quit();

    }

}
