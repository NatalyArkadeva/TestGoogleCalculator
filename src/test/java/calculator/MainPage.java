package calculator;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    @FindBy(xpath = "//input[@name = 'q']")
    private WebElement searchField;

    public MainPage() {
        driver.get(ConfProperties.getProperty("url"));
        PageFactory.initElements(driver, this);
    }

    public CalculatorPage createSearch(String search) {
        searchField.sendKeys(search, Keys.ENTER);
        return new CalculatorPage();
    }

}
