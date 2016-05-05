/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.rental.system;

/**
 *
 * @author 041602455
 */
public class PerDayRental {
    
    int price;
    int km;
    
    PerDayRental(int days, int km)
    {
        price += days * 100;
        this.km += km;
    }
}
