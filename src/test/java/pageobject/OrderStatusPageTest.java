package pageobject;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OrderStatusPageTest extends BaseUITest {

    @Test
    public void checkOrderStatusForNonExistingOrder() {
        boolean isOrderNotFoundImageDisplayed = new MainPage(driver)
                .open()
                .clickOrderStatusButton()
                .enterOrderNumber("1")
                .clickSearchOrderButton()
                    .isOrderNotFoundImageDisplayed();

        assertTrue("Order not found image is not displayed", isOrderNotFoundImageDisplayed);
    }

}