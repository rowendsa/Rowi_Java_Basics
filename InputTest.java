/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This program is used to demonstrate the use of providing inputs in Java
 * @version 1.20 2017-05-06
 * @author rowen
 */
import java.util.*;

public class InputTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        //get the first input
        System.out.println("What is your name?");
        String yourName = in.nextLine();
        
        System.out.println("How old are you now?");
        int yourAge = in.nextInt();
        
        System.out.println("Hello "+ yourName +", Greetings of the season. Next year you will be "+ (yourAge + 1));
    }
    
}
