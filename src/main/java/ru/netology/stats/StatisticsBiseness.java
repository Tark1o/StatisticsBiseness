package ru.netology.stats;

public class StatisticsBiseness {

    public long calculateSumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long findAverage(long[] sales) {
        long sumSales = calculateSumSales(sales);
        return calculateSumSales(sales) / sales.length;
    }

    public long findNumberMonthWithMaxSales(long[] sales) {
        int monthMaxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSales]) {
                monthMaxSales = i;

            }
        }
        return monthMaxSales + 1;
    }

    public long findNumberMonthWithMinSales(long[] sales) {
        int monthMinSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSales]) {
                monthMinSales = i;
            }
        }
        return monthMinSales + 1;
    }

    public long findMonthsWithSalesBelowAverage(long[] sales) {
        long monthsBelowAverage = 0;
        long average = calculateSumSales(sales) / sales.length;
        for (long i : sales) {
            if (i < average) {
                monthsBelowAverage++;
            }
        }
        return monthsBelowAverage;
    }

    public long findMonthsWithSalesHigherAverage(long[] sales) {
        long monthsHigherAverage = 0;
        long average = calculateSumSales(sales) / sales.length;
        for (long i : sales) {
            if (i > average) {
                monthsHigherAverage++;
            }
        }
        return monthsHigherAverage;
    }


}
