package calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest extends BaseTest {

    @Test
    public void case1Test1() {
        String search = "калькулятор";
        MainPage page = new MainPage();
        page.createSearch(search).expression().getResultField();

        Assert.assertEquals(new CalculatorPage().getResultField(), ConfProperties.getProperty("case1ResultField"));
    }

    @Test
    public void case1Test2() {
        String search = "калькулятор";
        MainPage page = new MainPage();
        page.createSearch(search).expression().getMemoryField();

        Assert.assertEquals(new CalculatorPage().getMemoryField(), ConfProperties.getProperty("case1MemoryField"));
    }

    @Test
    public void case2Test1() {
        String search = "калькулятор";
        MainPage page = new MainPage();
        page.createSearch(search).divisionByZero().getMemoryField();

        Assert.assertEquals(new CalculatorPage().getMemoryField(), ConfProperties.getProperty("case2MemoryField"));
    }

    @Test
    public void case2Test2() {
        String search = "калькулятор";
        MainPage page = new MainPage();
        page.createSearch(search).divisionByZero().getResultField();

        Assert.assertEquals(new CalculatorPage().getResultField(), ConfProperties.getProperty("case2ResultField"));
    }

    @Test
    public void case3Test1() {
        String search = "калькулятор";
        MainPage page = new MainPage();
        page.createSearch(search).errorSinWithoutValue().getMemoryField();

        Assert.assertEquals(new CalculatorPage().getMemoryField(), ConfProperties.getProperty("case3MemoryField"));
    }

    @Test
    public void case3Test2() {
        String search = "калькулятор";
        MainPage page = new MainPage();
        page.createSearch(search).errorSinWithoutValue().getResultField();

        Assert.assertEquals(new CalculatorPage().getResultField(), ConfProperties.getProperty("case3ResultField"));
    }
}
