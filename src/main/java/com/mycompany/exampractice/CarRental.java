
package com.mycompany.exampractice;


public class CarRental implements ICarRental {
    private static final double VAT_RATE = 0.15;      
    // total price including VAT
    @Override
    public double CalculateTotalRentalPrice(int numberOfDays, double dailyRate)
    {
        double subtotal = numberOfDays * dailyRate;        // price before VAT
        double total = subtotal + (subtotal * VAT_RATE);   // add 15% VAT
        return total;
    }
    // returns true only when all validation rules pass
    @Override
    public boolean ValidateData(CarRentalData data)
    {
        if (data.getCarName() == null || data.getCarName().isEmpty())
        {
            return false;                    // car name cannot be empty
        }
        if (data.getDailyRate() <= 0)
        {
            return false;                    // daily rate cannot be zero or less
        }
        if (data.getNumberOfDays() <= 0)
        {
            return false;                    // days cannot be zero or less
        }
        return true;                         // all rules passed
    }
    
}
