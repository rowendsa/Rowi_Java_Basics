/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rowen
 */
public class Welcome2 {
    public static void main(String[] args)
    {
        String[] Message = new String[4];
        Message[0] = "There is a new message for you";
        Message[1] = "We are learning Java together";
        Message[2] = "It is going to be a great experience";
        Message[3] = "It will be an awesome experience";
        System.out.println("There is something that needs to be told");
        for(String m : Message)
        {
            System.out.println(m);
        }
    }
}