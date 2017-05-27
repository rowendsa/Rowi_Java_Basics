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

public class retirement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        //Get the goal
        System.out.println("How much do you want to retire?");
        double goal = in.nextDouble();
        
        //get the payment 
        System.out.println("How do you pay every year?");
        double payment = in.nextDouble();
        
        //get the interestRate
        System.out.println("How much is the interest rate per year in?");
        double interestRate = in.nextDouble();
        
        //initialize balance and years
        double balance = 0;
        int years = 0;
        
        //Calculate the years
        while (balance <= goal)
        {
            balance+=payment;
            balance+=balance*interestRate/100;
            years++;
        }
        
        System.out.printf("You will need to work for %d years\n", years);
    }
    
}
