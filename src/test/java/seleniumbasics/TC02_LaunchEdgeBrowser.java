package seleniumbasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TC02_LaunchEdgeBrowser {

    public static void main(String[] args){

        /*
        Calling edgedriver static method from class WebDriverManager to setup edgedriver
        Make sure WebDriverManager dependency is added in pom.xml file
         */
        WebDriverManager.edgedriver().setup();

        //Create EdgeDriver instance
        WebDriver driver=new EdgeDriver();

        //maximize the browser window
        driver.manage().window().maximize();

        //open the URL
        driver.get("http://softtestautomation.in");

        //close browser all associated windows
        driver.quit();

    }

}
