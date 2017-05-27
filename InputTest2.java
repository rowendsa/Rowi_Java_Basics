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

public class InputTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        //Getting the name
        System.out.println("What is your name?");
        String yourName = in.nextLine();
        
        //Getting the age
        System.out.println("How old are you?");
        int yourAge = in.nextInt();
        
        //Display of age and name formmatting
        System.out.printf("Hello %s, Greetings of the season. Now the time is %tc. Next year your age will be %d\n",yourName, new Date(),(yourAge+1));
    }
    
}
