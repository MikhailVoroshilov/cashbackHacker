package ru.netology.service;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainZero() {
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected,"wrong bonus");
    }

    @Test
    public void shouldRemain() {
        int actual = service.remain(2000);
        int expected = 1000;

        assertEquals(actual, expected,"wrong bonus");
    }

    @Test
    public void shouldRemainBoundary() {
        int actual = service.remain(10000);
        int expected = 1000;

        assertEquals(actual, expected,"wrong bonus");
    }
}