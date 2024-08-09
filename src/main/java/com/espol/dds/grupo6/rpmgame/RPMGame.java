/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espol.dds.grupo6.rpmgame;

/**
 *
 * @author sebas
 */
public class RPMGame {
    private static Round round;
    private boolean finish;
    
    public static void start(Round round){
        System.out.println("******Round: "+round.getRound()+"**************");
        System.out.println();
    }

    public static void main(String[] args) {
        round = new Round();
        start(round);
        System.out.println("Hello World!");
    }
}
