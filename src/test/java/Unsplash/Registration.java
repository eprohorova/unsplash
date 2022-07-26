package Unsplash;

import Unsplash.Data;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Registration extends Data {

    private By buttonJoinFree = By.xpath("//*[@id=\"app\"]/div/header/nav/div[5]/a[2]");

    private By inputFirstName = By.xpath("//*[@id=\"user_first_name\"]");
    private By inputLastName = By.xpath("//*[@id=\"user_last_name\"]");
    private By inputEmail = By.xpath("//*[@id=\"user_email\"]");
    private By inputUsername = By.xpath("//*[@id=\"user_username\"]");
    private By inputPassword = By.xpath("//*[@id=\"user_password\"]");

    private By buttonJoin = By.xpath("//*[@id=\"new_user\"]/div[5]/a");

    @Test

    public void registration() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        Data getData = new Data();

        driver.get(getData.getUrl);
        driver.manage().window().maximize();

        driver.findElement(buttonJoinFree).click();
        sleep(3000);

        driver.findElement(inputFirstName).sendKeys(getData.firstName);
        driver.findElement(inputLastName).sendKeys(getData.lastName);
        driver.findElement(inputEmail).sendKeys(getData.email);
        driver.findElement(inputUsername).sendKeys(getData.username);
        driver.findElement(inputPassword).sendKeys(getData.password);

        driver.findElement(buttonJoin).click();
        driver.quit();
    }

}
