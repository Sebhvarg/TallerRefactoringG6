/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.dds.grupo6.rpmgame;

/**
 *
 * @author sebas
 */
public abstract class Choice{
    public abstract Result compare(Choice other, Player p1, Player p2);
    abstract String getName();
}
