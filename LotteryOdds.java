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
/**
 * This program is used to demonstrate a <code>for</code> loop.
 * @version 1.20 2017-05-06
 * @author rowen
 */
public class LotteryOdds {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("How many numbers do you want to draw?");
        int k = in.nextInt();
        
        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();
        
        int lotteryOdds = 1;
        
        for(int i = 1; i<=k; i++)
            lotteryOdds = lotteryOdds * (n - i + 1)/i;
        
        System.out.println("Your odds are 1 in "+ lotteryOdds +". Good luck!");
    }
}
