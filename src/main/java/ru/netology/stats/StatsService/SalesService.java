package ru.netology.stats.StatsService;

public class SalesService {
    public long getAllSales(long[] sales) {

        long sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        return sumSales;
    }

    public long getAverageSales(long[] sales) {

        long averageSales = 0;
        long sumSales = getAllSales(sales);
        for (int i = 0; i < sales.length; i++) {
            averageSales = sumSales / sales.length;
        }
        return averageSales;
    }

    public int getMaxMonth(long[] sales) {

        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth(long[] sales) {

        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMonthsSalesUnderAverage(long[] sales) {

        int MonthsSalesUnderAverage = 0;
        long averageSales = getAverageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                MonthsSalesUnderAverage = MonthsSalesUnderAverage + 1;
            }
        }
        return MonthsSalesUnderAverage;
    }

    public int getMonthsSalesOverAverage(long[] sales) {

        int MonthsSalesOverAverage = 0;
        long averageSales = getAverageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                MonthsSalesOverAverage = MonthsSalesOverAverage + 1;
            }
        }
        return MonthsSalesOverAverage;
    }
}