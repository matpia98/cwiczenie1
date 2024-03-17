package pl.javastart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DaysInMonthCounterTest {
    @Test
    public void shouldYear2018And6thMonthReturn30Days() {
        DaysInMonthCounter daysInMonthCounter = new DaysInMonthCounter();
        int dayCount = daysInMonthCounter.getDayCount(2018, 6);
        Assertions.assertEquals(30, dayCount);
    }

    @Test
    public void shouldYear2018And6thMonthReturn31Days() {
        DaysInMonthCounter daysInMonthCounter = new DaysInMonthCounter();
        int dayCount = daysInMonthCounter.getDayCount(2018, 7);
        Assertions.assertEquals(31, dayCount);
    }

    @Test
    public void shouldYear2018And8thMonthReturn31Days() {
        DaysInMonthCounter daysInMonthCounter = new DaysInMonthCounter();
        int dayCount = daysInMonthCounter.getDayCount(2018, 8);
        Assertions.assertEquals(31, dayCount);
    }

    @Test
    public void shouldYear2018And2thMonthReturn28Days() {
        DaysInMonthCounter daysInMonthCounter = new DaysInMonthCounter();
        int dayCount = daysInMonthCounter.getDayCount(2018, 2);
        Assertions.assertEquals(28, dayCount);
    }

    @Test
    public void shouldYear2016And2thMonthReturn29Days() {
        DaysInMonthCounter daysInMonthCounter = new DaysInMonthCounter();
        int dayCount = daysInMonthCounter.getDayCount(2016, 2);
        Assertions.assertEquals(29, dayCount);
    }

    @Test
    public void shouldYear2010And2thMonthReturn28Days() {
        DaysInMonthCounter daysInMonthCounter = new DaysInMonthCounter();
        int dayCount = daysInMonthCounter.getDayCount(2010, 2);
        Assertions.assertEquals(28, dayCount);
    }

    @Test
    public void shouldYear2100And2thMonthReturn28Days() {
        DaysInMonthCounter daysInMonthCounter = new DaysInMonthCounter();
        int dayCount = daysInMonthCounter.getDayCount(2100, 2);
        Assertions.assertEquals(28, dayCount);
    }

    @Test
    public void shouldYear2000And2thMonthReturn29Days() {
        DaysInMonthCounter daysInMonthCounter = new DaysInMonthCounter();
        int dayCount = daysInMonthCounter.getDayCount(2000, 2);
        Assertions.assertEquals(29, dayCount);
    }

}