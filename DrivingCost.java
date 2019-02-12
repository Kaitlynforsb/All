/* This program will output the cost of driving a certain distance,
given the distance driven, fuel efficiency of the car, and the
price per gallon of gasoline */

import java.util.Scanner;

public class DrivingCost

{
  
    public static void main (String [] args) 
 {   
    Scanner scan = new Scanner (System.in);
    
    double DistDriven, FuelEff, PriceGal, Pricetot;
    
    System.out.println("Enter the driving distance: ");
    System.out.println("Enter the fuel efficiency of the vehicle: ");
    System.out.println("Enter the price per gallon of gasoline: ");
    
    DistDriven = scan.nextDouble();
    FuelEff = scan.nextDouble();
    PriceGal = scan.nextDouble();
    double PriceTot = (DistDriven/FuelEff)*PriceGal;
    
    System.out.println("The distance driven is: " + DistDriven);
    System.out.println("The fuel efficiency of the vehicle is: " + FuelEff);
    System.out.println("The price per gallon of gasoline is: " + PriceGal);
    System.out.println("The cost of driving is: " + PriceTot);
    
    
  }
}   