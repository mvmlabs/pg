package cat.institutmvm;
import java.util.Scanner;

public class LectorValorsDesconeguts {
    public static final int MARCA_FI = -1;
    public static final String TXT_VALOR = "Valor llegit: ";
    public static final String MSG_1 = "Escriu diferents valors enters. ";
    public static final String MSG_2 = "Després del darrer valor escriu un " + MARCA_FI;
    public static final String MSG_3 = "Ja s'han llegit tots els valors.";

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println(MSG_1 + MSG_2);
        //es llegeixen exactament NUM_VALORS valors.
        boolean marcaTrobada = false;
        while (!marcaTrobada) {
            //abans de llegir, comprovem si realment hi ha un enter.
            if (lector.hasNextInt()) {
                int valor = lector.nextInt();
                //és la marca de final?
                if (valor == MARCA_FI) {
                //cert
                    marcaTrobada = true;
                } else {
                //no, és un valor que ha de ser tractat.
                    System.out.println(TXT_VALOR + valor);
                }
            } else {
                //si el valor no és enter, es llegeix però s'ignora (buidem el buffer)
                lector.next();
            }
        }
        //els valors que sobrin a la darrera línia escrita es descarten.
        lector.nextLine();
        System.out.println(MSG_3);
    }
}
