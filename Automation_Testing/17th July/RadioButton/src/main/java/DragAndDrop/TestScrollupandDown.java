package DragAndDrop;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScrollupandDown {

    WebDriver driver;
    String url = "https://www.spicejet.com/";

    @Test
    public void Test() throws Exception {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        Thread.sleep(10000);

        ((JavascriptExecutor) driver).executeScript("scroll(0,6000)");

        Thread.sleep(5000);

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-4200);");
    }
}