/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.dds.grupo6.rpmgame;

/**
 *
 * @author Santiago
 */
public class Round {
    private int roundPlayed;

    public Round() {
        this.roundPlayed = 1;
    }

    public int getRound() {
        return roundPlayed;
    }

    public void nextRound() {
        this.roundPlayed++;
    }
    
}
