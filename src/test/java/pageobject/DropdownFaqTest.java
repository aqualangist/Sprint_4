package pageobject;

import datafortests.DropdownAnswers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DropdownFaqTest extends BaseUITest {

    @Test
    public void checkPaymentSumAndWayShouldBeMatch() {
        String actualFirstAnswer = new DropdownFaq(driver)
                .open()
                .clickPaymentSumAndWay();
        assertEquals("Текст ответа на совпадает", DropdownAnswers.FIRST_RIGHT_ANSWER, actualFirstAnswer);

    }

    @Test
    public void checkSeveralScootersShouldBeMatch() {
        String actualSecondAnswer = new DropdownFaq(driver)
                .open()
                .clickSeveralScooters();
        assertEquals("Текст ответа на совпадает", DropdownAnswers.SECOND_RIGHT_ANSWER, actualSecondAnswer);

    }

    @Test
    public void checkRentTimeShouldBeMatch() {
        String actualThirdAnswer = new DropdownFaq(driver)
                .open()
                .clickRentTime();
        assertEquals("Текст ответа на совпадает", DropdownAnswers.THIRD_RIGHT_ANSWER, actualThirdAnswer);

    }

    @Test
    public void checkTodayOrderShouldBeMatch() {
        String actualFourthAnswer = new DropdownFaq(driver)
                .open()
                .clickTodayOrder();
        assertEquals("Текст ответа на совпадает", DropdownAnswers.FOURTH_RIGHT_ANSWER, actualFourthAnswer);

    }

    @Test
    public void checkProlongAndRefundScooterShouldBeMatch() {
        String actualFifthAnswer = new DropdownFaq(driver)
                .open()
                .clickProlongAndRefundScooter();
        assertEquals("Текст ответа на совпадает", DropdownAnswers.FIFTH_RIGHT_ANSWER, actualFifthAnswer);

    }

    @Test
    public void checkScooterChargeShouldBeMatch() {
        String actualSixthAnswer = new DropdownFaq(driver)
                .open()
                .clickScooterCharge();
        assertEquals("Текст ответа на совпадает", DropdownAnswers.SIXTH_RIGHT_ANSWER, actualSixthAnswer);

    }

    @Test
    public void checkCancelOrderShouldBeMatch() {
        String actualSeventhAnswer = new DropdownFaq(driver)
                .open()
                .clickCancelOrder();
        assertEquals("Текст ответа на совпадает", DropdownAnswers.SEVENTH_RIGHT_ANSWER, actualSeventhAnswer);

    }

    @Test
    public void checkBehindMoscowShouldBeMatch() {
        String actualEightAnswer = new DropdownFaq(driver)
                .open()
                .clickBehindMoscow();
        assertEquals("Текст ответа на совпадает", DropdownAnswers.EIGHT_RIGHT_ANSWER, actualEightAnswer);

    }
}