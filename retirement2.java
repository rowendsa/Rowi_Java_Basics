/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rowen
 */
import java.util.*;

public class retirement2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        //get the payment
        System.out.println("How much do you pay each year?");
        double payment = in.nextDouble();
        
        //get the interest Rate
        System.out.println("What is the rate of interest %?");
        double interestRate = in.nextDouble();
        
        //initialize the variables
        double balance = 0;
        int years = 0;
        String myInput;
        
        //calculate the years
        do
        {
            balance+=payment;
            balance+=balance*interestRate/100;
            years++;
            
            //Announce the annual balance
            System.out.printf("After %d years, your savings are %,.2f\n",years,balance);
            
            //get the user consent
            System.out.println("Do you want to continue (Y/N or y/n)");
            myInput = in.nextLine();
        }
        while(myInput.equalsIgnoreCase("n"));
        
        System.out.println("Thanks for participating!!!");
    }
    
}
