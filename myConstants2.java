/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rowen
 */
public class myConstants2 {

    /**
     * @param args the command line arguments
     */
    public static final double CM_PER_INCH = 2.54;
    
    public static void main(String[] args) {
        // TODO code application logic here
    double paperWidth = 8.5;
    double paperHeight = 11;
    System.out.println("The dimension of the paper in centimeters is : "+ paperWidth * CM_PER_INCH + " by "+ paperHeight * CM_PER_INCH);
    }
    
}
