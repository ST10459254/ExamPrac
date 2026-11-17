
package com.mycompany.exampractice;


public interface ICarRental {
    double CalculateTotalRentalPrice(int numberOfDays, double dailyRate);
    boolean ValidateData(CarRentalData carRentalData);
}
