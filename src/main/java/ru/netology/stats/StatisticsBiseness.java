package ru.netology.stats;

public class StatisticsBiseness {

    public int calculateSumSales(int[]sales) {
        int sum = 0;
        for (int sale:sales) {
            sum += sale;
        }
        return sum;
        }

    public int findAverage(int[] sales) {
        int sumSales = calculateSumSales(sales);
        return calculateSumSales(sales)/sales.length;
    }
    public int findNumberMonthWithMaxSales (int[] sales) {
        int monthMaxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSales]) {
                monthMaxSales = i;

            }
        }
        return monthMaxSales + 1;
    }
    public int findNumberMonthWithMinSales (int[] sales) {
        int monthMinSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSales]) {
                monthMinSales = i;
            }
        }
        return monthMinSales + 1;
    }
    public int findMonthsWithSalesBelowAverage (int[] sales) {
        int monthsBelowAverage = 0;
        int average = calculateSumSales(sales) / sales.length;
        for (int i : sales) {
            if (i < average) {
                monthsBelowAverage++;
            }
        }
        return monthsBelowAverage;
    }
    public int findMonthsWithSalesHigherAverage (int[] sales) {
        int monthsHigherAverage = 0;
        int average = calculateSumSales(sales) / sales.length;
        for (int i : sales) {
            if (i > average) {
                monthsHigherAverage++;
            }
        }
        return monthsHigherAverage;
    }


}
