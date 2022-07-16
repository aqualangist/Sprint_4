package pageobject;

import datafortests.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class OrderPageScooterTest extends BaseUITest {

    private final Order order;
    private final String orderIsConfirm = "Заказ оформлен";

    public OrderPageScooterTest(Order order) {
        this.order = order;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
    return new Object[][] {
            {new Order("Юрий", "Деточкин", "Москва, Автозаводская, д.44, кв.55", "Автозаводская", "+79638521447")},
            {new Order("Тони", "Хоук", "Москва, Тверская, д.22, кв.33", "Тверская", "+79638521447")},
        };
    }

    //первый тест проверяет, что после подтверждения заказа отображается попап с текстом Заказ оформлен
    //ТЕСТ ПАДАЕТ, т.к. в браузере GoogleChrome заказ не оформляется до конца
    @Test
    public void checkOrderPlacedViaTopButton() {

        String orderHasBeenPlaced = new MainPage(driver)
                .open()
                .clickMakeOrderTopButton()
                .fillOrderDetailsForm(order)
                .clickFurtherButton()
                .selectDateToDelivery()
                .selectRentTime()
                .selectScooterColor()
                .makingOrder()
                .confirmOrder()
                    .getTextInOrderModalHeader();
        assertEquals("Order was not created", orderIsConfirm, orderHasBeenPlaced);
    }

    @Test
    public void checkOrderPlacedViaLowerButton() {

        String orderHasBeenPlaced = new MainPage(driver)
                .open()
                .clickMakeOrderLowerButton()
                .fillOrderDetailsForm(order)
                .clickFurtherButton()
                .selectDateToDelivery()
                .selectRentTime()
                .selectScooterColor()
                .makingOrder()
                .confirmOrder()
                    .getTextInOrderModalHeader();
        assertEquals("Order was not created", orderIsConfirm, orderHasBeenPlaced);
    }



    //второй тест проверяет, что отображается попап с кнопками Да/Нет на последнем шаге создания заказа
    @Test
    public void checkOrderConfirmPopupViaTopButton() {

        boolean isConfirmPopupDisplayed = new MainPage(driver)
                .open()
                .clickMakeOrderTopButton()
                .fillOrderDetailsForm(order)
                .clickFurtherButton()
                .selectDateToDelivery()
                .selectRentTime()
                .selectScooterColor()
                .makingOrder()
                .confirmOrder()
                    .isOrderConfirmPopupDisplayed();
        assertTrue("Popup is not displayed", isConfirmPopupDisplayed);
    }

    @Test
    public void checkOrderConfirmPopupViaLowerButton() {

        boolean isConfirmPopupDisplayed = new MainPage(driver)
                .open()
                .clickMakeOrderLowerButton()
                .fillOrderDetailsForm(order)
                .clickFurtherButton()
                .selectDateToDelivery()
                .selectRentTime()
                .selectScooterColor()
                .makingOrder()
                .confirmOrder()
                    .isOrderConfirmPopupDisplayed();
        assertTrue("Popup is not displayed", isConfirmPopupDisplayed);
    }
}