/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.narrowingcasting;

/**
 *
 * @author Sanele
 */
public class App {

    public static void main(String[] args) {
        double myDouble = 9.78d;
        int myInt = (int) myDouble; //Manual casting to int
        System.out.println(myDouble); //Outputs 9.78
        System.out.println(myInt);  //Outputs 9
        
    }
}
