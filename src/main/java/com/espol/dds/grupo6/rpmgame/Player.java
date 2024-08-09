/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.dds.grupo6.rpmgame;

import java.util.Random;

/**
 *
 * @author sebas
 */
public class Player{
    
    private int wins = 0;

    public Choice choose() {
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 0 -> {
                return new Rock();
            }
            case 1 -> {
                return new Paper();
            }
            case 2 -> {
                return new Scissors();
            }
        }
        return null;  // No debería llegar aquí
    }

    public void incrementWins() {
        wins++;
    }

    public int getWins() {
        return wins;
    }
    
}
