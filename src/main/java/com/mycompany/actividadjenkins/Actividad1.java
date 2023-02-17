/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividadjenkins;

/**
 *
 * @author Moisés López
 */
public class Actividad1 {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    
    public static boolean dia_laboral(String dia) {
        switch(dia) {
            case "Lunes":
                return true;
            case "Martes":
                return true;
            case "Miercoles":
                return true;
            case "Jueves":
                return true;
            case "Viernes":
                return true;
            case "Sabado":
                return false;
            case "Domingo":
                return false;
            default:
                return false;
        }
    }
}
