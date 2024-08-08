package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldAdviseToBuy0() {

        Assert.assertEquals(service.remain(1_000), 0);

    }

    @Test
    public void shouldAdviseToBuy100() {

        Assert.assertEquals(service.remain(900), 100);

    }

    @Test
    public void shouldAdviseToBuy1() {

        Assert.assertEquals(service.remain(999), 1);

    }

    @Test
    public void shouldAdviseToBuy999() {

        Assert.assertEquals(service.remain(1), 999);

    }

    @Test
    public void shouldAdviseToBuy1000() {

        Assert.assertEquals(service.remain(0), 1000);

    }


    @Test
    public void shouldAdviseToBuyStill999() {

        Assert.assertEquals(service.remain(1_001), 999);

    }

}