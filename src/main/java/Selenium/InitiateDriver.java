package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Created by aditya.mullela on 03/02/17.
 */
public class InitiateDriver {

        public void initiateBrowser(String browserName) {

            WebDriver driver;
            if(browserName.equals("firefox")){
                driver = new FirefoxDriver();
            } else if(browserName.equals("safari")){
                driver = new SafariDriver();
            } else if(browserName.equals("internetExplorer")){
                driver = new InternetExplorerDriver();
            } else {
                driver = new ChromeDriver(); //default
            }

        }
}
