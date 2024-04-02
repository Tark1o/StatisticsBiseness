import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatisticsBiseness;

public class StatisticsBisenessTest {

    @Test
    public void shouldSumSales() {
        StatisticsBiseness service = new StatisticsBiseness();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedSum = 180;
        int actualSum = service.calculateSumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverage() {
        StatisticsBiseness service = new StatisticsBiseness();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedAverage = 15;
        int actualAverage = service.findAverage(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shoudFindNumberMonthWithMaxSales() {
        StatisticsBiseness service = new StatisticsBiseness();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedNumberMonthWithMaxSales = 8;
        int actualNumberMonthWithMaxSales = service.findNumberMonthWithMaxSales(sales);
        Assertions.assertEquals(expectedNumberMonthWithMaxSales, actualNumberMonthWithMaxSales);
    }

    @Test
    public void shouldFindNumberMonthWithMinSales() {
        StatisticsBiseness service = new StatisticsBiseness();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedNumberMonthWithMinSales = 9;
        int actualNumberMonthWithMinSales = service.findNumberMonthWithMinSales(sales);
        Assertions.assertEquals(expectedNumberMonthWithMinSales, actualNumberMonthWithMinSales);
    }

    @Test
    public void shouldFindMonthsWithSalesBelowAverage() {
        StatisticsBiseness service = new StatisticsBiseness();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedMonthsMinAverage = 5;
        int actualMonthsMinAverage = service.findMonthsWithSalesBelowAverage(sales);
        Assertions.assertEquals(expectedMonthsMinAverage, actualMonthsMinAverage);
    }

    @Test
    public void shouldFindMonthsWithSalesHigherAverage() {
        StatisticsBiseness service = new StatisticsBiseness();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedMonthsHigherAverage = 5;
        int actualMonthsHigherAverage = service.findMonthsWithSalesHigherAverage(sales);
        Assertions.assertEquals(expectedMonthsHigherAverage, actualMonthsHigherAverage);
    }
}
