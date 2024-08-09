/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.dds.grupo6.rpmgame;

/**
 *
 * @author sebas
 */
public class Win extends Result {
    private final Choice winnerChoice;
    private final Player winner;
    public Win(Choice winnerChoice, Player winner){
        this.winnerChoice = winnerChoice;
        this.winner = winner;
        
    }
       @Override
    public Player getWinner() {
        return winner;
    }
    
   
    
}
