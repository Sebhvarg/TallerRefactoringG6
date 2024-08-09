/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espol.dds.grupo6.rpmgame;

/**
 *
 * @author sebas
 */
public class RPMGame {


    public static void main(String[] args) {
    
        Player p1 = new Player();
        Player p2 = new Player();
        boolean gameNow = false;
        int roundsPlayed = new Round().getRoundPlayed();
        
        int p1Wins = 0;
        int p2Wins = 0;
        int draw = 0;

        do {
            System.out.println("********* Round: " + roundsPlayed + " ***************\n");
            System.out.println("Number of Draws: " + draw + "\n");

            Choice p1Choice = p1.choose();
            System.out.println("Player 1: " + p1Choice.getName() + "\t Player 1 Total Wins: " + p1Wins);

            Choice p2Choice = p2.choose();
            System.out.println("Player 2: " + p2Choice.getName() + "\t Player 2 Total Wins: " + p2Wins);

            Result result = p1Choice.compare(p2Choice, p1, p2);

            if (result instanceof Win) {
                if (result.getWinner() == p1) {
                    p1Wins++;
                } else {
                    p2Wins++;
                }
            } else if (result instanceof Draw) {
                draw++;
                System.out.println("\n\t\t Draw \n");
            }

            roundsPlayed++;

            if (p1.getWins() >= 3 || p2.getWins() >= 3) {
                gameNow = true;
                System.out.println("GAME WON");
            }
            if (roundsPlayed == 11){
                gameNow = true;
            }

            System.out.println();
        } while (!gameNow);
    
    
    }
     
}
