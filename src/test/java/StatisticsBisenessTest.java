import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatisticsBiseness;

public class StatisticsBisenessTest {

    @Test
    public void shouldSumSales() {
        StatisticsBiseness service = new StatisticsBiseness();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expectedSum = 180;
        long actualSum = service.calculateSumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverage() {
        StatisticsBiseness service = new StatisticsBiseness();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expectedAverage = 15;
        long actualAverage = service.findAverage(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shoudFindNumberMonthWithMaxSales() {
        StatisticsBiseness service = new StatisticsBiseness();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expectedNumberMonthWithMaxSales = 8;
        long actualNumberMonthWithMaxSales = service.findNumberMonthWithMaxSales(sales);
        Assertions.assertEquals(expectedNumberMonthWithMaxSales, actualNumberMonthWithMaxSales);
    }

    @Test
    public void shouldFindNumberMonthWithMinSales() {
        StatisticsBiseness service = new StatisticsBiseness();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expectedNumberMonthWithMinSales = 9;
        long actualNumberMonthWithMinSales = service.findNumberMonthWithMinSales(sales);
        Assertions.assertEquals(expectedNumberMonthWithMinSales, actualNumberMonthWithMinSales);
    }

    @Test
    public void shouldFindMonthsWithSalesBelowAverage() {
        StatisticsBiseness service = new StatisticsBiseness();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expectedMonthsMinAverage = 5;
        long actualMonthsMinAverage = service.findMonthsWithSalesBelowAverage(sales);
        Assertions.assertEquals(expectedMonthsMinAverage, actualMonthsMinAverage);
    }

    @Test
    public void shouldFindMonthsWithSalesHigherAverage() {
        StatisticsBiseness service = new StatisticsBiseness();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expectedMonthsHigherAverage = 5;
        long actualMonthsHigherAverage = service.findMonthsWithSalesHigherAverage(sales);
        Assertions.assertEquals(expectedMonthsHigherAverage, actualMonthsHigherAverage);
    }
}
