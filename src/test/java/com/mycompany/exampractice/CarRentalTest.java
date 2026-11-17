
package com.mycompany.exampractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author iamg7
 */
public class CarRentalTest {
    
    /**
     * Test of CalculateTotalRentalPrice method, of class CarRental.
     */
    @Test
    public void testCalculateTotalRentalPrice() {
        // arrange
        CarRental rental = new CarRental();
        double expected = 1380.0;                  
        // 3 x 400 = 1200, plus 15% VAT
        // act
        double actual = rental.CalculateTotalRentalPrice(3, 400);
        // assert
        assertEquals(expected, actual, 0.01);
    }

    /**
     * Test of ValidateData method, of class CarRental.
     */
    @Test
    public void testValidateData() {
        // arrange: only the number of days is invalid
        CarRental rental = new CarRental();
        CarRentalData data = new CarRentalData();
        data.setCarName("VW Polo");
        data.setNumberOfDays(0);
        data.setDailyRate(300);
        // act
        boolean result = rental.ValidateData(data);
        // assert
        assertFalse(result);
    }
    
}
