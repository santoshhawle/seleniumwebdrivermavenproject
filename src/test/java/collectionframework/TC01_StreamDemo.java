package collectionframework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class TC01_StreamDemo {

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
        driver.get("https://www.selenium.dev/");

        //Get all menu list
        List<WebElement> menuList=driver.findElements(By.xpath("//div[@id='main_navbar']//li/a"));

        //print all the menu list
        System.out.println(menuList.stream().map(menu->menu.getText()).collect(Collectors.toList()).toString());

        //close browser all associated windows
        driver.quit();

    }
}
