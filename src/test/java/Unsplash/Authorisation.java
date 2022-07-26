package Unsplash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authorisation extends Data {

    WebDriver driver = new ChromeDriver();
    Data getData = new Data();

    private By buttonLoginFree = By.xpath("//*[@id=\"app\"]/div/header/nav/div[5]/a[1]");

    private By inputEmail = By.xpath("//*[@id=\"user_email\"]");
    private By inputPassword = By.xpath("//*[@id=\"user_password\"]");

    private By buttonLogin = By.xpath("/html/body/div[2]/div/div/div/div/form/div[3]/input");

    private By getResultText = By.xpath("/html/body/div[1]/div/div/div[2]");

    @Test
    public void authorisation() {

        driver.get(getData.getUrl);
        driver.manage().window().maximize();

        driver.findElement(buttonLoginFree).click();

        driver.findElement(inputEmail).sendKeys(getData.email);
        driver.findElement(inputPassword).sendKeys(getData.password);

        driver.findElement(buttonLogin).click();
        driver.quit();




    }
    @Test
    public void authorisation_negative() {

        driver.get(getData.getUrl);
        driver.manage().window().maximize();

        driver.findElement(buttonLoginFree).click();

        driver.findElement(inputEmail).sendKeys(getData.email_2);
        driver.findElement(inputPassword).sendKeys(getData.password_2);

        driver.findElement(buttonLogin).click();

        String getResult = driver.findElement(getResultText).getText();
        Assertions.assertEquals("Invalid email or password.", getResult);
        //driver.quit();
    }
}
