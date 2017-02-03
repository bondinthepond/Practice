import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by aditya.mullela on 31/01/17.
 */
public class Main3 {

    public static void main(String[] args) throws IOException {

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

        String excelFilePath = "/Users/aditya.mullela/git2/Selenium/Test2.xls";

        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

        Workbook workbook = new HSSFWorkbook(inputStream);
        Sheet firstSheet = workbook.getSheetAt(0);
        Row row = firstSheet.getRow(0);
        Cell cell = row.getCell(0);
        String s = cell.getStringCellValue();
        Cell cell1 = row.getCell(1);
        String s1 = cell1.getStringCellValue();

        System.out.println(s + s1);

            }
        }
