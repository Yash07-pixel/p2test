package org.test.webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class WebpageTest {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://yash07-pixel.github.io/p2test");
    }

    @Test
    public void testTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Department of ICB"; // match your index.html title
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}