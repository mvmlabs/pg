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
    public int valida(int num, Scanner sc, String msg){
        int value=0;            
        do{
            System.out.println(msg);
            value = sc.nextInt();
        }while(value<=num);
        return value;
    } 
    
    //demana per teclat un valor que estigui dins el rang [min, max],
    // i el retorna quan es compleix la condició
    public int valida(int min, int max, Scanner sc, String msg){
        int value=0;      
        do{
            System.out.println(msg);
            value = sc.nextInt();
        }while(value<=min || value>=max);
        return value;
    }
    
}
