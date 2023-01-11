package cat.institutmvm.app;

import cat.institutmvm.utils.InputManagement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int valor;
        InputManagement entrada = new InputManagement();
        Scanner sc = new Scanner(System.in);
        
        valor = entrada.valida(1, sc, "Introdueix un nombre més gran o igual que 1");       
        System.out.println(valor);
        
        valor = entrada.valida(3, 10, sc, "Introdueix un nombre entre el 3 i el 10 (inclosos)");
        System.out.println(valor);
        
        sc.close();
    }   
}
