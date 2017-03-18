package Selenium;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

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

    public void test() throws InterruptedException, IOException {

        // download chromeDriver, run it and provide the port number
//        URL url = new URL("http://127.0.0.1:9515");
//        WebDriver driver = new RemoteWebDriver(url, DesiredCapabilities.chrome());
//        driver.get("http://www.google.com");

        // download chromeDriver and set property by providing its location
//        System.setProperty("webdriver.chrome.driver", "/Users/aditya.mullela/Downloads/chromedriver");
//        WebDriver driver2 = new ChromeDriver();
//        driver2.get("http://www.google.com");

        // download geckoDriver, run it and provide the port number or set property - require for selenium versions > 3
//        URL url1 = new URL("http://127.0.0.1:4444"); //require gecko driver
//        WebDriver driver1 = new RemoteWebDriver(url1, DesiredCapabilities.firefox());

//        WebDriver driver3  = new SafariDriver();

        System.setProperty("webdriver.chrome.driver", "/Users/aditya.mullela/Downloads/chromedriver");
        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://www.snapdeal.com/");

        synchronized (driver2) {
            driver2.wait(10l);
            String excelFilePath = "/Users/aditya.mullela/git2/Selenium/Config.xls";

            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

            Workbook workbook = new HSSFWorkbook(inputStream);
            Sheet elementLocationSheet = workbook.getSheetAt(0);
            Sheet testDataSheet = workbook.getSheetAt(1);

            Iterator<Row> iterator = elementLocationSheet.iterator();

            Row firstRow = iterator.next();

            Iterator<Cell> iterator1 = firstRow.iterator();

            ArrayList nameOfColumns = new ArrayList();

            while (iterator1.hasNext()) {
                nameOfColumns.add(iterator1.next().getStringCellValue());
            }

            while (iterator.hasNext()) {

                Row row = iterator.next();
                String[] properties = new String[3];

                Iterator<Cell> cellIterator = row.cellIterator();
                properties[0] = cellIterator.next().getStringCellValue();
                properties[1] = cellIterator.next().getStringCellValue();
                properties[2] = cellIterator.next().getStringCellValue();

                driver2.findElement(By.id(properties[2])).sendKeys("adidas");
                driver2.findElement(By.className("searchformButton col-xs-4 rippleGrey")).click();

            }
        }
    }
}
