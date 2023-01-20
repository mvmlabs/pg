package cat.institutmvm.app;

import cat.institutmvm.utils.InputManagement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int valor;
        InputManagement entrada = new InputManagement();
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Introdueix un nombre més gran o igual que 1");
            valor = entrada.valida(sc.nextInt(), 1);
        }while(valor<1);
        
        do{
            System.out.println("Introdueix un valor entre 3 i 10 (inclosos)");
            valor = entrada.valida(sc.nextInt(), 3, 10);
        }while(valor<3 || valor>10);
        
        sc.close();
    }   
}

