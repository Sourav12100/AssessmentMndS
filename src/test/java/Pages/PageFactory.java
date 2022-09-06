package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private Hover dropdownHover;
    private HomePage homePage;
    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public Hover getDropdownHover() {
        if (dropdownHover == null) {
            dropdownHover = new Hover(driver);
        }
        return dropdownHover;
    }

    public Pages.HomePage getHomePage()
    {
        if(homePage == null)
        {
            homePage = new Pages.HomePage(driver);
        }
        return homePage;
    }
}
