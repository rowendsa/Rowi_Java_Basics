/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rowen
 */
public class myStringCompare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String greeting = "Hello";
        
        // checking if it is using same allocation in the memory
        if(greeting == "Hello")
            System.out.println("this means it is pointing to the same location in memory which is very rare");
        else
            System.out.println("this is allocated separately");
        
        if (greeting.equals("hello"))
        System.out.println("This is the same string");
        else
            System.out.println("This is not the same string, probably differs in case");
        
        // using the ignorecase
        if (greeting.equalsIgnoreCase("hello"))
            System.out.println("Both the string were same except the case");
        else
            System.out.println("These are both totally different strings");
        
    }
    
}
