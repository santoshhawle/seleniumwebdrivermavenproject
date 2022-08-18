package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class TC05_HTMLUnitDriverHeadless {

    public static void main(String[] args){

        //Create HtmlUnitDriver instance
        WebDriver driver=new HtmlUnitDriver();

        //maximize the browser window
        driver.manage().window().maximize();

        //open the URL
        driver.get("http://softtestautomation.in");

        //close browser all associated windows
        driver.quit();

    }

}
