package calculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage extends BasePage {

    @FindBy(xpath = "//div[@aria-label='открывающая скобка']")
    private WebElement openingParenthesis;

    @FindBy(xpath = "//div[@aria-label='закрывающая скобка']")
    private WebElement closingParenthesis;

    @FindBy(xpath = "//div[text()='0']")
    private WebElement zero;

    @FindBy(xpath = "//div[text()='1']")
    private WebElement one;

    @FindBy(xpath = "//div[text()='2']")
    private WebElement two;

    @FindBy(xpath = "//div[text()='3']")
    private WebElement three;

    @FindBy(xpath = "//div[text()='4']")
    private WebElement four;

    @FindBy(xpath = "//div[text()='5']")
    private WebElement five;

    @FindBy(xpath = "//div[text()='6']")
    private WebElement six;

    @FindBy(xpath = "//div[@aria-label='сложение']")
    private WebElement plus;

    @FindBy(xpath = "//div[@aria-label='вычитание']")
    private WebElement minus;

    @FindBy(xpath = "//div[@aria-label='умножение']")
    private WebElement multiply;

    @FindBy(xpath = "//div[@aria-label='деление']")
    private WebElement divide;

    @FindBy(xpath = "//div[@aria-label='равно']")
    private WebElement is;

    @FindBy(xpath = "//div[@aria-label='синус']")
    private WebElement sin;

    @FindBy(xpath = "//span[@id='cwos']")
    private WebElement resultField;

    @FindBy(xpath = "//span[@class='vUGUtc']")
    private WebElement memoryField;


    public CalculatorPage() {
        PageFactory.initElements(driver, this);
    }

    public String getMemoryField() {
        return memoryField.getText();
    }

    public String getResultField() {
        return resultField.getText();
    }

    public CalculatorPage expression() {
        openingParenthesis.click();
        one.click();
        plus.click();
        two.click();
        closingParenthesis.click();
        multiply.click();
        three.click();
        minus.click();
        four.click();
        zero.click();
        divide.click();
        five.click();
        is.click();
        return new CalculatorPage();
    }

    public CalculatorPage divisionByZero() {
        six.click();
        divide.click();
        zero.click();
        is.click();
        return new CalculatorPage();
    }

    public CalculatorPage errorSinWithoutValue() {
        sin.click();
        openingParenthesis.click();
        closingParenthesis.click();
        is.click();
        return new CalculatorPage();
    }

}
