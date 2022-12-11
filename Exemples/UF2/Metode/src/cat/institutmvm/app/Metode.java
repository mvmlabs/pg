package cat.institutmvm.app;

import java.util.Scanner;
import cat.institutmvm.utils.Math;

public class Metode {
    //variables globals
    private int val1 = 3, val2 = 4;
    private static final String MSG_1 = "Introdueix dos nombres: ";
    private static final String MSG_2 = "Resultat amb valors globals: ";
    private static final String MSG_3 = "Resultat amb pas de paràmetres: ";
    
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        Metode method = new Metode();
        Math mt = new Math();
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println(MSG_3 + mt.sumar(num1, num2));
        System.out.println(MSG_2 + method.sumar());
    } 
    
        
    //mètode que retorna la suma dels dos valors globals
    public int sumar(){
        return val1+val2;
    } 
}
