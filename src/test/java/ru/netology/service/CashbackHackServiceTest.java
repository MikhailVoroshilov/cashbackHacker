package ru.netology.service;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainZero() {
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemain() {
        int actual = service.remain(2000);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainBoundary() {
        int actual = service.remain(10000);
        int expected = 1000;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldRemainBoundaryNotComment() {
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }
}