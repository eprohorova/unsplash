package Unsplash;

import Unsplash.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class FindImage extends Data {

    WebDriver driver = new ChromeDriver();
    Data getData = new Data();

    private By searchImage = By.xpath("//*[@id=\"popover-visual-search-form-homepage-header\"]/button");
    private By inputImage = By.xpath("//*[@id=\"popover-visual-search-form-homepage-header\"]/div/div/div/div/div/div[2]/div/div[1]/div/input");
    private By getText = By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/h1");

    @Test

    public void findImage() throws InterruptedException {

        driver.get(getData.getUrl);
        driver.manage().window().maximize();
        driver.findElement(searchImage).click();
        sleep(3000);
        driver.findElement(inputImage).sendKeys(getData.pathFail);
        sleep(3000);
        String getTextVisual = driver.findElement(getText).getText();
        Assertions.assertEquals("Visual search", getTextVisual);
        driver.quit();

    }
}
