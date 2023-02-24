package ru.netology.stats.StatsService;

import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService.SalesService;

public class SalesServiceTest {

    @Test
    public void sumAllSales() {
        SalesService service = new SalesService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSales = 180;
        long sumSales = service.getAllSales(arr);
    }

    @Test
    public void averageSales() {
        SalesService service = new SalesService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSales = 15;
        long averageSales = service.getAverageSales(arr);
    }

    @Test
    public void maxMonth() {
        SalesService service = new SalesService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int maxMonth = service.getMaxMonth(arr);
    }

    @Test
    public void minMonth() {
        SalesService service = new SalesService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int minMonth = service.getMinMonth(arr);
    }

    @Test
    public void MonthsSalesUnderAverage() {
        SalesService service = new SalesService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonths = 5;
        int MonthsSalesUnderAverage = service.getMonthsSalesUnderAverage(arr);
    }

    @Test
    public void MonthsSalesOverAverage() {
        SalesService service = new SalesService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonths = 5;
        int MonthsSalesOverAverage = service.getMonthsSalesOverAverage(arr);
    }
}
