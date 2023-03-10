/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividadjenkins;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author olivertm
 */
public class Actividad1Test {
    
    @Test
    public void testDia_laboral_Lunes() {
        System.out.println("dia_laboral Lunes");
        String dia = "Lunes";
        boolean expResult = true;
        boolean result = Actividad1.dia_laboral(dia);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDia_laboral_Martes() {
        System.out.println("dia_laboral Martes");
        String dia = "Martes";
        boolean expResult = true;
        boolean result = Actividad1.dia_laboral(dia);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDia_laboral_Miercoles() {
        System.out.println("dia_laboral Miercoles");
        String dia = "Miercoles";
        boolean expResult = true;
        boolean result = Actividad1.dia_laboral(dia);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDia_laboral_Jueves() {
        System.out.println("dia_laboral Jueves");
        String dia = "Jueves";
        boolean expResult = true;
        boolean result = Actividad1.dia_laboral(dia);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDia_laboral_Viernes() {
        System.out.println("dia_laboral Viernes");
        String dia = "Viernes";
        boolean expResult = true;
        boolean result = Actividad1.dia_laboral(dia);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDia_laboral_Sabado() {
        System.out.println("dia_laboral Sabado");
        String dia = "Sabado";
        boolean expResult = false;
        boolean result = Actividad1.dia_laboral(dia);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDia_laboral_Domingo() {
        System.out.println("dia_laboral Domingo");
        String dia = "Domingo";
        boolean expResult = false;
        boolean result = Actividad1.dia_laboral(dia);
        assertEquals(expResult, result);
    }
 }