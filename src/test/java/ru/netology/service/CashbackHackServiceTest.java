package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    void shouldAdviseToBuy0() {

        Assert.assertEquals(service.remain(1_000), 0);

    }

    @Test
    void shouldAdviseToBuy100() {

        Assert.assertEquals(service.remain(900), 100);

    }

    @Test
    void shouldAdviseToBuy1() {

        Assert.assertEquals(service.remain(999), 1);

    }

    @Test
    void shouldAdviseToBuy999() {

        Assert.assertEquals(service.remain(1), 999);

    }

    @Test
    void shouldAdviseToBuy1000() {

        Assert.assertEquals(service.remain(0), 1000);

    }


    @Test
    void shouldAdviseToBuyStill999() {

        Assert.assertEquals(service.remain(1_001), 999);

    }

}