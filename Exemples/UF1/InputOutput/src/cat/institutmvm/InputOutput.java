/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

public class InputOutput {
    private static final String MSG_1 = "Benvingut/da!";
    private static final String MSG_2 = "Introdueix un enter: ";
    private static final String MSG_3 = "Introdueix un decimal: ";
    private static final String MSG_4 = "Introdueix una cadena: ";
    private static final String RESULT_1 = "El valor enter és ";
    private static final String RESULT_2 = ", el valor decimal és ";
    private static final String RESULT_3 = " i el valor cadena és ";
    
    
    public static void main(String[] args) {
        System.out.println(MSG_1);
        Scanner readValue = new Scanner(System.in);
        System.out.println(MSG_2);
        int valorEnter = readValue.nextInt();
        System.out.println(MSG_3);
        double valorReal = readValue.nextDouble();
        System.out.println(MSG_4);
        String valorCadena = readValue.next();        
        System.out.println(RESULT_1 + valorEnter + RESULT_2 + valorReal + RESULT_3 + valorCadena);
    }  
}
