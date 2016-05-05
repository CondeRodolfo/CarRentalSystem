/*
Creator:
    Rodolfo Melanda Conde
    Creation Date:
    05/05/16
Methods:
    + void main (String [] args)
	+
    
Classes this class requires
    Java.util.scanner
Classes that require this class
    None
*/
package car.rental.system;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rodolfo Melanda Conde
 */

public class CarRentalSystem {

    /**
     * @param args the command line arguments
     */
    
    // <editor-fold defaultstate="collapsed" desc="Global Variables Declaration">
    static Scanner scan = new Scanner(System.in);
    static String manufacturer;
    static String model;
    static String manufactureYear;
    static double totalKmTravelled;
    static int menu = 0;
    static int numDays = 0;
    // </editor-fold>
    
    
    public static void main(String[] args) {

        //Variable Creation
        int count = 0;
        //Creation of the List of cars
        ArrayList carList = new ArrayList();
        

        while(count != 5)
        {
            //Objects instantiation
            Vehicle car = new Vehicle();
            Journey j1 = new Journey();
            FuelPurchase f1 = new FuelPurchase();
            
            //Main Menu
            System.out.println("\nWelcome to the Car Rental System.");
            System.out.println("(1) Register Car.");
            System.out.println("(2) Rent car charging per Day.");
            System.out.println("(3) Rent car charging per Km.");
            System.out.println("(4) Display Registered Cars.");
            System.out.println("(5) Exit.");
            System.out.println("Choose one of the options above.");
            count = scan.nextInt();
               
            switch(count)
            {
                // <editor-fold defaultstate="collapsed" desc="Case to register car">
                case 1:
                    //Menu
                    RegisterMenu();

                    //Saving the car information
                    car.setManufacturer(manufacturer);
                    car.getManufacturer();
                    car.setModel(model);
                    car.getModel();
                    car.setManufactureYear(manufactureYear);
                    car.getManufactureYear();

                    carList.add(car);
                    break;
                // </editor-fold>
                    
                // <editor-fold defaultstate="collapsed" desc="Case to rent car per Day">
                case 2:
                    //Error Message if there are no cars registrated
                    if(carList.isEmpty())
                    {
                        System.out.println("Please, register a car first.");
                    }
                    
                    else
                    {
                        int carNum = 0;
                        int carSelect;
                        
                        System.out.println("\nThese are the registred cars:");
                        
                        //Loop to print all vehicles registreded
                        for(int counter = 0;counter < carList.size(); counter++)
                        {
                            car = (Vehicle)carList.get(counter);
                            System.out.println("(" + carNum + ") " + car.getModel());
                            carNum++;
                        }
                        System.out.println("Chose a car from the list above:");
                        carSelect = scan.nextInt();
                        
                        //Loop to select a car from the list
                        for(int counter = 0;counter < carList.size(); counter++)
                        {
                            car = (Vehicle)carList.get(counter);
                            //Deciding which car to save the information
                            if(carSelect == carList.indexOf(car))
                            {
                                //Menu
                                DayRentMenu();

                                //Saving the information
                                car.setTotalKmTravelled(totalKmTravelled);
                                car.serv.setServiceValue(totalKmTravelled);
                                car.setNumDays(numDays);
                                car.fuel.setFuelValue(totalKmTravelled);
                                car.journey.setNumJourneys(1);
                                
                                //Required methods (fuelPurchase and addJourney)
                                //car.addJourney(j1);
                                //car.changeFuelPurchase(f1);
                                
                                carList.remove(car);
                                carList.add(car);
                            }
                            else
                            {
                                System.out.println("Please choose a number from the list.");
                            }
                        }
                    }
                    break;
                // </editor-fold>
                
                // <editor-fold defaultstate="collapsed" desc="Case to rent car per Km">
                case 3:
                    if(carList.isEmpty())
                    {
                        System.out.println("Please, register a car first.");
                    }
                    else
                    {
                        int carNum = 0;
                        int carSelect;
                        
                    System.out.println("\nThese are the registred cars:");
                        
                    //Loop to print all vehicles registreded
                    for(int counter = 0;counter < carList.size(); counter++)
                    {
                        car = (Vehicle)carList.get(counter);
                        System.out.println("(" + carNum + ") " + car.getModel());
                        carNum++;
                    }
                    System.out.println("Chose a car from the list above:");
                    carSelect = scan.nextInt();

                    //Loop to select a car from the list
                    for(int counter = 0;counter < carList.size(); counter++)
                    {
                        car = (Vehicle)carList.get(counter);
                        //Deciding which car to save the information
                        if(carSelect == carList.indexOf(car))
                        {
                            KmRentMenu();
                            
                            
                            car.setTotalKmTravelled(totalKmTravelled);
                            car.serv.setServiceValue(totalKmTravelled);
                            car.serv.getServiceValue();
                            car.fuel.setFuelValue(totalKmTravelled);
                            car.journey.setNumJourneys(1);
                            
                            //Required methods (fuelPurchase and addJourney)
                            //car.addJourney(j1);
                            //car.changeFuelPurchase(f1);
                            
                            carList.remove(car);
                            carList.add(car);
                            
                        }
                        else
                        {
                            System.out.println("Please choose a number from the list.");
                        }
                    }
                    }

                    break;
                // </editor-fold>
                    
                // <editor-fold defaultstate="collapsed" desc="Case to display all cars and details">
                case 4:
                    if(carList.size() == 0)
                    {
                        System.out.println("Register at least one car first.");
                    }
                    else
                    {
                        System.out.println("Those are the cars:");
                        for(int counter = 0;counter < carList.size(); counter++)
                        {
                            car = (Vehicle)carList.get(counter);
                            car.Print();
                        }
                    }
                    
                    break;
                // </editor-fold>
                    
                // <editor-fold defaultstate="collapsed" desc="Case to exit the program">
                case 5:
                    System.out.println("Thank you for using this program.");
                    break;
                // </editor-fold>    
                
                // <editor-fold defaultstate="collapsed" desc="Default Case">
                default:
                    System.out.println("Choose one of the options from the list.");
                    break;
                // </editor-fold>
            }
        }
    }
    
    //Menu to register the cars
    public static void RegisterMenu()
    {
        //Entrance messages
        System.out.println("\nInsert bellow the information of the car.");
        //User Inputs
        System.out.println("Please, enter the manufacturer of the car:");
        manufacturer = scan.next();
        System.out.println("Please, enter the model of the car:");
        model = scan.next();
        System.out.println("Please, enter the year of the car:");
        manufactureYear = scan.next();
    }
    
    //Menu to rent per day
    public static void DayRentMenu()
    {
        System.out.println("Insert bellow the amount of days:");
        numDays = scan.nextInt();
        System.out.println("Insert bellow the amount of KMs travelled:");
        totalKmTravelled = scan.nextDouble();
    }
    
    //Menu to rent per KM
    public static void KmRentMenu()
    {
        System.out.println("Please, enter the total kilometres travelled:");
        totalKmTravelled = scan.nextDouble();
    }
}
