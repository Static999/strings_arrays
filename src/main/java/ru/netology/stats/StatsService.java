package ru.netology.stats;

import java.util.concurrent.LinkedTransferQueue;

public class StatsService {

    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;

        }
        return totalSale;
    }

    public long average(long[] sales) {
        long totalSale = sum(sales);
        return sum(sales) / sales.length;
    }

    public int monthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        long maximumSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maximumSale) {
                monthMaximum = i;
                maximumSale = sales[i];

            }

        }
        return monthMaximum + 1;
    }

    public int monthMinimumSale(long[] sales) {
        int monthMaximum = 0;
        long minimumSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minimumSale) {
                monthMaximum = i;
                minimumSale = sales[i];

            }

        }
        return (int) minimumSale;
    }

    public int monthBellowAverage(long[] sales) {
        int count = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                count++;
            }
        }
        return count;
    }

    public int monthAboveAverage(long[] sales) {
        int count = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                count++;
            }
        }
        return count;
    }


}