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
public class Journey {
    
    int numJourneys;
    
    Journey()
    {
        numJourneys = 0;
    }

    //Number of Journeys geter and Setter
    public void setNumJourneys(int numJourneys) 
    {
        this.numJourneys += numJourneys;
    }
    public int getNumJourneys() 
    {
        return numJourneys;
    }

}
