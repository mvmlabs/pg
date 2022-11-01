package cat.institutmvm;

import java.util.Scanner;

public class ValidacioDades {
    private static final String MSG_1 = "Introdueix un valor enter entre 0 i 10: ";
    private static final String MSG_2 = "Dada correcta. Has escrit ";

    public static void main(String[] args) {
        int valorUsuari = 0;
        boolean valorCorrecte;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(MSG_1);
            valorCorrecte = sc.hasNextInt();
            if (valorCorrecte) {
                valorUsuari = sc.nextInt();
            } else {
                sc.next();
            }
        } while ((!valorCorrecte) || ((valorUsuari < 0) || (valorUsuari > 10)));
        //Tot correcte
        System.out.println(MSG_2 + valorUsuari);
    }
}
