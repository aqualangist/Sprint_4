package pageobject;

import datafortests.ScooterUrls;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class DropdownFaq extends BasePage {

    public DropdownFaq(WebDriver driver) {

        super(driver);
    }

    //"Сколько это стоит? И как оплатить?"
    private final By paymentSumAndWayQuestion = By.id("accordion__heading-0");
    private final By paymentSumAndWayAnswer = By.xpath(".//div[@id='accordion__panel-0']/p");

    //"Хочу сразу несколько самокатов! Так можно?"
    private final By severalScootersQuestion = By.id("accordion__heading-1");
    private final By severalScootersAnswer = By.xpath(".//div[@id='accordion__panel-1']/p");

    //"Как рассчитывается время аренды?"
    private final By rentTimeQuestion = By.id("accordion__heading-2");
    private final By rentTimeAnswer = By.xpath(".//div[@id='accordion__panel-2']/p");

    //"Можно ли заказать самокат прямо на сегодня?"
    private final By todayOrderQuestion = By.id("accordion__heading-3");
    private final By todayOrderAnswer = By.xpath(".//div[@id='accordion__panel-3']/p");

    //"Можно ли продлить заказ или вернуть самокат раньше?"
    private final By prolongAndRefundScooterQuestion = By.id("accordion__heading-4");
    private final By prolongAndRefundScooterAnswer = By.xpath(".//div[@id='accordion__panel-4']/p");

    //"Вы привозите зарядку вместе с самокатом?"
    private final By scooterChargeQuestion = By.id("accordion__heading-5");
    private final By scooterChargeAnswer = By.xpath(".//div[@id='accordion__panel-5']/p");

    //"Можно ли отменить заказ?"
    private final By cancelOrderQuestion = By.id("accordion__heading-6");
    private final By cancelOrderAnswer = By.xpath(".//div[@id='accordion__panel-6']/p");

    //"Я жизу за МКАДом, привезёте?"
    private final By behindMoscowQuestion = By.id("accordion__heading-7");
    private final By behindMoscowAnswer = By.xpath(".//div[@id='accordion__panel-7']/p");


    public DropdownFaq open() {
        driver.get(ScooterUrls.HOME_URL);
        WebElement element = driver.findElement(By.className("Home_FourPart__1uthg"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        return this;
    }

    public String clickPaymentSumAndWay() {
        driver.findElement(paymentSumAndWayQuestion).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement element = driver.findElement(paymentSumAndWayAnswer);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        return driver.findElement(paymentSumAndWayAnswer).getText();

    }

    public String clickSeveralScooters() {
        driver.findElement(severalScootersQuestion).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement element = driver.findElement(severalScootersAnswer);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        return driver.findElement(severalScootersAnswer).getText();
    }

    public String clickRentTime() {
        driver.findElement(rentTimeQuestion).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement element = driver.findElement(rentTimeAnswer);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        return driver.findElement(rentTimeAnswer).getText();
    }

    public String clickTodayOrder() {
        driver.findElement(todayOrderQuestion).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement element = driver.findElement(todayOrderAnswer);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        return driver.findElement(todayOrderAnswer).getText();
    }

    public String clickProlongAndRefundScooter() {
        driver.findElement(prolongAndRefundScooterQuestion).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement element = driver.findElement(prolongAndRefundScooterAnswer);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        return driver.findElement(prolongAndRefundScooterAnswer).getText();
    }

    public String clickScooterCharge() {
        driver.findElement(scooterChargeQuestion).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement element = driver.findElement(scooterChargeAnswer);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        return driver.findElement(scooterChargeAnswer).getText();
    }

    public String clickCancelOrder() {
        driver.findElement(cancelOrderQuestion).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement element = driver.findElement(cancelOrderAnswer);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        return driver.findElement(cancelOrderAnswer).getText();
    }

    public String clickBehindMoscow() {
        driver.findElement(behindMoscowQuestion).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement element = driver.findElement(behindMoscowAnswer);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        return driver.findElement(behindMoscowAnswer).getText();
    }

}