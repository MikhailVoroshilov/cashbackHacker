package ru.netology.service;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainZero() {
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain() {
        int actual = service.remain(2000);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainBoundary() {
        int actual = service.remain(10000);
        int expected = 1000;

        assertEquals(actual, expected);
    }
}