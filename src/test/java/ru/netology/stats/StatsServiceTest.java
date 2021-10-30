package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] officeSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(officeSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAvgSum() {
        StatsService service = new StatsService();
        int[] officeSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAvgSum(officeSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSales() {
        StatsService service = new StatsService();
        long[] officeSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSales(officeSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMinSales() {
        StatsService service = new StatsService();
        long[] officeSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(officeSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthWithSalesLowAvg() {
        StatsService service = new StatsService();

        int[] officeSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.monthWithSalesLowAvg(officeSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthWithSalesHighAvg() {
        StatsService service = new StatsService();

        int[] officeSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.monthWithSalesHighAvg(officeSales);

        assertEquals(expected, actual);
    }
}
