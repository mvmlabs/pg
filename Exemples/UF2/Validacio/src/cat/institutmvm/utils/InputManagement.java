/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.utils;

import java.util.Scanner;

/**
 *
 * @author raquel
 */
public class InputManagement {
    //demana per teclat un valor que sigui >= a num,
    // i el retorna quan es compleix la condició
    public int valida(int num, int value){
        return (num<value)? 0 : num;
    }
    
        
    //demana per teclat un valor que estigui dins el rang [min, max],
    // i el retorna quan es compleix la condició
    public int valida(int num, int min, int max){
        return (num<min || num>max)? 0 : num;
    }  
    
}
