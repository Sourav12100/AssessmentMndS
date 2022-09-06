package  Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Hover {
    WebDriver driver;
    By viewAll = By.xpath("(//li/a[contains(text(),'View All')])[1]");
    public Hover(WebDriver driver)
    {
        this.driver = driver;
    }


    public void dropdownHover()
    {
        WebElement ele = driver.findElement(By.xpath("(//a[@class='nav-primary__menu-link icon--hdr-arrow-right'])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(ele).perform();
        driver.findElement(viewAll).click();
    }
}
