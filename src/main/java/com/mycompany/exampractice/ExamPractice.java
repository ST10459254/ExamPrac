
package com.mycompany.exampractice;


public class ExamPractice {

    public static void main(String[] args) {
       String[] drivers = {"Thabo", "Lerato", "Sipho"};
       int [][] trips = {{8,10,7,12,9},{11,9,13,8,10},{6,12,9,7,14}};
       TaxiTrips taxi = new TaxiTrips();
       int[] totals = new int[drivers.length];
       System.out.println("TAXI TRIPS REPORT - WEEK 46");
       System.out.println();
       System.out.printf("%-8s%5s%7s%7s%7s%7s%n", "", "MON", "TUE", "WED", "THU", "FRI");
       System.out.println("------------------------------------------------");
       
       for (int row=0; row<trips.length; row++){
           System.out.printf("%-8s", drivers[row]);
           for (int col = 0; col < trips[row].length; col++)
           {
               System.out.printf("%5d  ", trips[row][col]);
           }
           System.out.println();
           totals[row] = taxi.TotalTrips(trips[row]); 
       }
       System.out.println();
       for (int i = 0; i < drivers.length; i++)
       {
           System.out.println("Total trips for " + drivers[i] + ": " + totals[i]);
       }
       System.out.println();
       System.out.printf("Average trips per driver per day: %.2f%n", taxi.AverageTrips(trips));
       System.out.println();
       System.out.println("Top performing driver: " + taxi.TopDriver(drivers, totals));
    }
}
