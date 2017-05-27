/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rowen
 */
public class myStringBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder myString = new StringBuilder();
        char ch = 'L';
        String ourString = "ove";
        myString.append(ch);
        myString.append(ourString);
        
        String completeString = myString.toString();
        
        System.out.println("The new string now is: "+completeString);
    }
    
}
