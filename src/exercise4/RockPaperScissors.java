/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import java.util.Scanner;

/**
 *
 * @author PHOTON
 */
public class RockPaperScissors{
	public static void main(String[] args){
            
            Scanner sc = new Scanner(System.in);
            String repeat = "y";

            Move rock = new Move("Rock");
            Move paper = new Move("Paper");
            Move scissors = new Move("Scissors");

            rock.setStrongAgainst(scissors);
            paper.setStrongAgainst(rock);
            scissors.setStrongAgainst(paper);

            int roundsToWin = 2;
            int playerScore = 0;
            int computerScore = 0;

            while(repeat.equalsIgnoreCase("y")){
            System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
            System.out.println("1. Start Game");
            System.out.println("2. Change number of Rounds");
            System.out.println("3. Exit Application"); 

            String menuchoice = sc.nextLine();

            //Start Game
            if(menuchoice.equals(1)){

            }

            //Change number of Rounds
            if(menuchoice.equals(2)){

            }

            //Exit Application
            if(menuchoice.equals(3)){
                System.out.println("Thank you for playing!");
                repeat = "n";
            }

            }
	}      
}
