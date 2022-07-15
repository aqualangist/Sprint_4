package pageobject;

import datafortests.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderDetailsFormPage extends BasePage {

    //локаторы для первой страницы заказа
    private final By customerName = By.xpath(".//input[@placeholder = '* Имя']");
    private final By customerSecondName = By.xpath(".//input[@placeholder = '* Фамилия']");
    private final By customerAddress = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");
    private final By metroStationList = By.xpath(".//input[@class='select-search__input']");
    private final By metroStationSelection = By.xpath(".//li[@data-index='34']");
    private final By customerPhone = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");
    private final By furtherButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final By backButton = By.xpath(".//[@class=Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i]");




    //локаторы для второй страницы заказа
    //когда привезти самокат
    private final By showCalendar = By.xpath(".//*[@class = 'Input_Input__1iN_Z Input_Responsible__1jDKN']");
    private final By dateToDelivery = By.xpath(".//div[@class='react-datepicker__day react-datepicker__day--017 react-datepicker__day--weekend']");
    //выпадающий список с выбором сроков аренды
    private final By rentTime = By.xpath(".//*[@class = 'Dropdown-placeholder']");
    //выбор срока "пятеро суток"
    private final By selectRentTime = By.xpath(".//div[text() ='пятеро суток']");
    //цвет - чёрный
    private final By scooterColor = By.xpath(".//input[@id='black']");
    //кнопка заказать
    private final By makeOrder = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //кнопка Да
    private final By yesButton = By.xpath(".//button[text() = 'Да']");
    //кнопка Нет
    private final By noButton = By.xpath(".//button[text() = 'Нет']");
    private final By confirmOrderPopup = By.xpath(".//div[@class='Order_Modal__YZ-d3']");
    //модальное окно с текстом "Заказ оформлен"
    private final By orderModal = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ']");

    public OrderDetailsFormPage(WebDriver driver) {
        super(driver);
    }

    public OrderDetailsFormPage fillOrderDetailsForm(Order order) {
        fillName(order.getName());
        fillSecondName(order.getSecondName());
        fillAddress(order.getAddress());
        fillMetroStation(order.getMetroStation());
        fillPhone(order.getPhone());
        return this;
    }

    private OrderDetailsFormPage fillName(String name) {
        driver.findElement(customerName).sendKeys(name);
        return this;
    }

    private OrderDetailsFormPage fillSecondName(String secondName) {
        driver.findElement(customerSecondName).sendKeys(secondName);
        return this;
    }

    private OrderDetailsFormPage fillAddress(String address) {
        driver.findElement(customerAddress).sendKeys(address);
        return this;
    }

    private OrderDetailsFormPage fillMetroStation(String metroStation) {
        driver.findElement(metroStationList).click();
        driver.findElement(metroStationSelection).click();
        return this;
    }

    private OrderDetailsFormPage fillPhone(String phone) {
        driver.findElement(customerPhone).sendKeys(phone);
        return this;
    }

    public OrderDetailsFormPage clickFurtherButton() {
        driver.findElement(furtherButton).click();
        return this;

    }

    public OrderDetailsFormPage selectDateToDelivery() {
        driver.findElement(showCalendar).click();
        driver.findElement(dateToDelivery).click();
        return this;

    }

    public OrderDetailsFormPage selectRentTime() {
        driver.findElement(rentTime).click();
        driver.findElement(selectRentTime).click();
        return this;

    }

    public OrderDetailsFormPage selectScooterColor() {
        driver.findElement(scooterColor).click();
        return this;

    }

    public OrderDetailsFormPage makingOrder() {
        driver.findElement(makeOrder).click();
        return this;

    }

    public OrderDetailsFormPage confirmOrder() {
        driver.findElement(yesButton).click();
        return this;

    }

    public boolean isOrderConfirmPopupDisplayed() {

        return driver.findElement(confirmOrderPopup).isDisplayed();
    }

    // получение текста "Статус заказа"
    public String getTextInOrderModalHeader() {
        return  driver.findElement(orderModal).getText();
    }

}

