package cat.institutmvm;
import java.util.Scanner;

public class Metodes {
    //variables globals
    private int val1 = 3, val2 = 4;
    private static final String MSG_1 = "Introdueix dos nombres: ";
    private static final String MSG_2 = "Resultat amb valors globals: ";
    private static final String MSG_3 = "Resultat amb pas de paràmetres: ";
    
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        Metodes method = new Metodes();
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println(MSG_3 + method.sumar(num1, num2));
        System.out.println(MSG_2 + method.sumar());
    }
    
    //mètode que retorna la suma dels dos arguments
    public int sumar(int num1, int num2){
        return num1+num2;
    }
    
    //mètode que retorna la suma dels dos valors globals
    public int sumar(){
        return val1+val2;
    }  
}
