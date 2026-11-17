
package com.mycompany.exampractice;


public interface ITaxiTrips {
    int TotalTrips(int[] driverTrips);
    double AverageTrips(int[][] trips);
    String TopDriver(String[] drivers, int[] totalTrips);
}
