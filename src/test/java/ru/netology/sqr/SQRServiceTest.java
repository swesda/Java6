package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @Test
    public void calcSqrtInTheInterval() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqrt(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcSqrtOutTheInterval() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqrt(10, 99);

        Assertions.assertEquals(expected, actual);
    }
}
