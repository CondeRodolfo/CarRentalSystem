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
public class FuelPurchase {
    
    private double fuelPrice;
    private double totalPrice;
    
    FuelPurchase()
    {
        fuelPrice = 1.123;
    }
    
    public void setFuelValue(double km)
    {
        totalPrice += (km / 10) * fuelPrice;
    }
    public double getFuelValue()
    {
        return totalPrice;
    }
}
