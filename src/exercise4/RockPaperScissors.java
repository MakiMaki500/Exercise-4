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
            int repeat = 0;

            Move rock = new Move("Rock");
            Move paper = new Move("Paper");
            Move scissors = new Move("Scissors");

            rock.setStrongAgainst(scissors);
            paper.setStrongAgainst(rock);
            scissors.setStrongAgainst(paper);

            int roundsToWin = 2;
            int playerScore = 0;
            int computerScore = 0;

            while(repeat!=3){
                System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
                System.out.println("1. Start Game");
                System.out.println("2. Change number of Rounds");
                System.out.println("3. Exit Application"); 

                String menuchoice = sc.nextLine();


                //Start Game
                if(menuchoice.equals("1")){
                    System.out.println("This match will be first to "+roundsToWin+" wins.");
                    playerScore = 0;
                    computerScore = 0;
                    while((playerScore!=roundsToWin)&&(computerScore!=roundsToWin)){
                        
                        int computerMove = (int) Math.floor(Math.random()*3) + 1;
                        System.out.println("The computer has selected its move. Select your move:");
                        System.out.println("1. Rock");
                        System.out.println("2. Paper");
                        System.out.println("3. Scissors"); 
                        int result;
                        int moveChoice = Integer.parseInt(sc.nextLine());

                        Move computerMoveObject=rock;
                        Move playerMoveObject=rock;
                        
                        switch(moveChoice){
                            case 1: playerMoveObject=rock;
                                    break;
                            case 2: playerMoveObject=scissors;
                                    break;
                            case 3: playerMoveObject=paper;
                                    break;
                        }
                        switch(computerMove){
                            case 1: computerMoveObject=rock;
                                    break;
                            case 2: computerMoveObject=scissors;
                                    break;
                            case 3: computerMoveObject=paper;
                                    break;
                        }
                        result = Move.compareMoves(playerMoveObject,computerMoveObject);
                        System.out.print("Player chose "+playerMoveObject.getName()+". Computer chose "+computerMoveObject.getName()+". ");
                        switch(result){
                            case 0: System.out.println("Player wins round!");
                                    playerScore ++;
                                    break;
                            case 1: System.out.println("Computer wins round!");
                                    computerScore ++;
                                    break;
                            case 2: System.out.println("Round is tied!");
                                    break;
                        }
                        System.out.println("Player: "+playerScore+" - Computer: "+computerScore);
                        
                    }
                    if(playerScore==roundsToWin){
                            System.out.println("\nPlayer Wins!\n");
                    }
                    if(computerScore==roundsToWin){
                            System.out.println("\nComputer Wins!\n");
                    }
                }

                //Change number of Rounds
                if(menuchoice.equals("2")){
                    System.out.println("How many wins are needed to win a match?");
                    int roundChoice = Integer.parseInt(sc.nextLine());
                    roundsToWin = roundChoice;
                    System.out.println("New setting has been saved!");

                }

                //Exit Application
                if(menuchoice.equals("3")){
                    System.out.println("Thank you for playing!");
                    repeat = 3;
                }

            }
	}      
}
