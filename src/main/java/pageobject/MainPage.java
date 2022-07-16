package pageobject;

import datafortests.ScooterUrls;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver) {

        super(driver);
    }

    private final By orderStatusButton = By.xpath(".//button[@class='Header_Link__1TAG7']");
    private final By orderNumberInput = By.xpath(".//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']");
    private final By searchOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Header_Button__28dPO']");
    private final By makeOrderTopButton = By.className("Button_Button__ra12g");
    private final By acceptCookies = By.xpath(".//button[@class='App_CookieButton__3cvqF']");
    private final By makeOrderLowerButton = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");

    //переменная dropdownFaqBlock - для пролиствывания до блока с подсказками, чтобы долистать до нижней кнопки Заказать
    private final By dropdownFaqBlock = By.className("Home_FourPart__1uthg");

    //нажать кнопку статус заказа
    public MainPage clickOrderStatusButton() {
        driver.findElement(orderStatusButton).click();
        return this;
    }

    //ввести номер заказа
    public MainPage enterOrderNumber(String orderNumber) {
        driver.findElement(orderNumberInput).sendKeys(orderNumber);
        return this;
    }

    //нажать кнопку поиска заказа
    public OrderStatusPage clickSearchOrderButton() {
        driver.findElement(searchOrderButton).click();
        return new OrderStatusPage(driver);
    }

    //нажать верхнюю кнопку заказа
    public OrderDetailsFormPage clickMakeOrderTopButton() {
        driver.findElement(makeOrderTopButton).click();
        return new OrderDetailsFormPage(driver);
    }

    //нажать верхнюю кнопку заказа
    public OrderDetailsFormPage clickMakeOrderLowerButton() {
        driver.findElement(acceptCookies).click();

        WebElement element = driver.findElement(dropdownFaqBlock);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(makeOrderLowerButton).click();
        return new OrderDetailsFormPage(driver);
    }


    public MainPage open() {
        driver.get(ScooterUrls.HOME_URL);
        return this;
    }


}
