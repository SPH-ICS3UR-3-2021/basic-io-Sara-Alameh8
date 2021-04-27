/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
/**
 *
 * @author k_zeb
 */
public class Main {
    public static void main(String[] args){
      
        String firstAnswer = "yes";
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to a counterfeit version of Mad Libs! "
     + "This is based off the song - Holding Out for a Hero - by Bonnie Tyler. " 
     + "Now, I am assuming you are ready to play, but is that a yes or no?");
        firstAnswer = in.nextLine();
        System.out.println("Well, your answer of "+firstAnswer+" is great either way. "
     + "Let's start!"); 

        String firstNoun = "hero";
        System.out.println("Pick a noun that is NOT a location/place, "
     + "and do not forget to captalize it!");
        firstNoun = in.nextLine();
       
        String timeOfDay = "night";
        System.out.println("Pick a time of day.(ex.night)");
        timeOfDay = in.nextLine();
        
        String firstAdjective = "strong";
        System.out.println("Pick an adjective.");
        firstAdjective = in.nextLine();

        String secondAdjective = "fast";
        System.out.println("Pick another adjective.");
        secondAdjective = in.nextLine(); 

        String thirdAdjective = "fresh";
        System.out.println("Pick an additonal adjective.");
        thirdAdjective = in.nextLine();

        String fourthAdjective = "sure";
        System.out.println("Pick one more adjective.");
        fourthAdjective = in.nextLine();
        
        String fifthAdjective = "larger";
        System.out.println("Pick a comparative adjective - ends in er - ");
        fifthAdjective = in.nextLine();

        System.out.println("Congratulation! You have reached the end! "
     + "Now, you are ready for your personalized version of Holding Out for a "+firstNoun+"!");

        System.out.println("----------------------------");//divider 

        System.out.println("I need a "+firstNoun+"! "
     + "I'm holding out for a "+firstNoun+" 'till the end of the "+timeOfDay+"!");
        System.out.println("They/its gotta be "+firstAdjective+", and they/its gotta be "+secondAdjective+". "
     + "And they/its gotta be "+thirdAdjective+" from the fight.");
        System.out.println("I need a "+firstNoun+"! "
     + "I'm holding out for a "+firstNoun+" 'till the morning light.");
        System.out.println("They/its gotta be "+fourthAdjective+" and they/its gotta be soon..." 
     + "and they/its gotta be "+fifthAdjective+" than life.");
        System.out.println(""+fifthAdjective+" than life...");
        
        in.close();
    }
    
}
