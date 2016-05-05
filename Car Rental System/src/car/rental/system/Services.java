/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.rental.system;

/**
 *
 * @author Rodolfo Melanda Conde
 */
public class Services 
{
    double total;
    
    Services()
    {
        
    }
    
    public void setServiceValue(double value)
    {
        total = value / 100;
    }
    public double getServiceValue()
    {
        return total;
    }
}
