/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.dds.grupo6.rpmgame;

/**
 *
 * @author sebas
 */
public class Scissors extends Choice {

     @Override
    public String getName() {
        return "scissors";
    }

    @Override
    public Result compare(Choice other, Player p1, Player p2) {
        if (other instanceof Paper) {
            return new Win(this, p1);
        } else if (other instanceof Rock) {
            return new Win(other, p2);
        } else {
            return new Draw();
        }
    }
    
}
