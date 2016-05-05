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
public class Vehicle 
{
    
    //Variables Declaration
    private String manufacturer;
    private String model;
    private String manufactureYear;
    private double totalKmTravelled;
    private int numDays;
    private int totalNumServices;
    private int numJourneys;
    private double totalFuelCost;
    private double fuelEconomy;
    Services serv;
    FuelPurchase fuel;
    Journey journey;
    
    //Constructor
    Vehicle()
    {
        serv = new Services();
        fuel = new FuelPurchase();
        journey = new Journey();
        manufacturer = "Toyota";
        model = "C-HR";
        manufactureYear = "2017";
        totalKmTravelled = 0;
        numDays = 0;
        totalFuelCost = 0;
        totalNumServices = 0;
        fuelEconomy = 0;
        numJourneys = 0;
    }
    
    //Copy Constructor
    Vehicle(Vehicle otherCar)
    {
        serv = new Services();
        fuel = new FuelPurchase();
        journey = new Journey();
        manufacturer = otherCar.manufacturer;
        model = otherCar.model;
        manufactureYear = otherCar.manufactureYear;
        totalKmTravelled = otherCar.totalKmTravelled;
        numDays = otherCar.numDays;
        totalFuelCost = otherCar.totalFuelCost;
        totalNumServices = otherCar.totalNumServices;
        fuelEconomy = otherCar.fuelEconomy;
        numJourneys = otherCar.numJourneys;
    }
    
    
    
// <editor-fold defaultstate="collapsed" desc="Getters and Setters">
            
    //Manufacturer Getter and Setter
    public String getManufacturer()
    {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer)
    {
        this.manufacturer =  manufacturer;
    }
    
    //Model Getter and Setter
    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    
    //ManufactureYear Getter and Setter
    public String getManufactureYear()
    {
        return manufactureYear;
    }
    public void setManufactureYear(String manufactureYear)
    {
        this.manufactureYear = manufactureYear;
    }
    
    //Total Kilometres Travelled Getter and Setter
    public double getTotalKmTravelled()
    {
        return totalKmTravelled;
    }
    public void setTotalKmTravelled(double totalKmTravelled)
    {
        this.totalKmTravelled += totalKmTravelled;
    }
    
    //Number of Days Getter and Setter
    public int getNumDays()
    {
        return numDays;
    }
    public void setNumDays(int numDays)
    {
        this.numDays += numDays;
    }
    
    //Total Fuel Cost Getter and Setter
    public double getTotalFuelCost()
    {
        return totalFuelCost;
    }
    public void setTotalFuelCost(double totalFuelCost)
    {
        this.totalFuelCost += totalFuelCost;
    }
    
    //Total Number of Services Getter and Setter
    public int getTotalNumServices()
    {
        return totalNumServices;
    }
    public void setTotalNumServices(int totalNumServices)
    {
        this.totalNumServices += totalNumServices;
    }
    
    //Fuel Economy Getter and Setter
    public double getFuelEconomy()
    {
        return fuelEconomy;
    }
    public void setFuelEconomy(double fuelEconomy)
    {
        this.fuelEconomy += fuelEconomy;
    }
    
    //Number of Journeys Getter and Setter
    public int getNumjourneys()
    {
        return journey.numJourneys;
    }
    public void setNumJourneys(int num)
    {
        journey.numJourneys += num;
    }
    
// </editor-fold>
    
    //Method to print car's details
    public void Print()
    {
        System.out.println("\n===================================");
        System.out.println("Here are the details of your car: ");
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Make Year: " + manufactureYear);
        System.out.println("Total Kilometres Travelled: " + totalKmTravelled + " Km");
        if(this.serv.getServiceValue() == 0)
        {
            System.out.println("Total Services: No Travel has been recorded yet");
        }
        else
        {
            System.out.println("Total Services: " + Double.toString(Math.floor(this.serv.getServiceValue()))); 
        }
        if(this.fuel.getFuelValue() == 0)
        {
            System.out.println("Total fuel expense: No fuel has been purchased yet");
        }
        else
        {
            System.out.println("Total fuel expense: $" + String.format("%.2f", this.fuel.getFuelValue()));
        }
        if(numDays != 0)
        {
            System.out.println("The car have been rented for " + numDays + " day(s) already");
        }
        else if(numDays == 0 && journey.numJourneys == 0)
        {
            //System.out.println("The car haven`t been rented per day");
        }
        else
        {
            System.out.println("The car was not rented per day");
        }
        if(journey.numJourneys == 0)
        {
            System.out.println("The car was not rented at all");
        }
        else
        {
            System.out.println("The car have been rented  " + journey.numJourneys + " time(s)");
        }
        System.out.println("===================================");
    }
    
    //Method to add a Journey
    public void addJourney(Journey thisIsJourney)
    {
        journey = thisIsJourney;
    }
    
    //Method to change the price of the Fuel
    public void changeFuelPurchase(FuelPurchase fuel)
    {
        fuel = fuel;
    }
}
