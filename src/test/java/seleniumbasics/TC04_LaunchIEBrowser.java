package seleniumbasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TC04_LaunchIEBrowser {

    public static void main(String[] args){

        /*
        Calling iedriver static method from class WebDriverManager to setup iedriver
        Make sure WebDriverManager dependency is added in pom.xml file
         */
        WebDriverManager.iedriver().setup();

        //Create FirefoxDriver instance
        WebDriver driver=new InternetExplorerDriver();

        //maximize the browser window
        driver.manage().window().maximize();

        //open the URL
        driver.get("http://softtestautomation.in");

        //close browser all associated windows
        driver.quit();

    }

}
