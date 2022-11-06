package cat.institutmvm;
import java.util.Scanner;

public class LectorValorsConeguts {
    //es llegiran 10 valors.
    public static final int NUM_VALORS = 10;
    public static final String TXT_VALOR = "Valor ";
    public static final String TXT_LLEGIT = " llegit: ";
    public static final String MSG_1 = "Escriu " + NUM_VALORS + " enters. Es pot fer en diferents línies.";
    public static final String MSG_2 = "Ja s'han llegit " + NUM_VALORS + " valors.";

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println(MSG_1);
        //es llegeixen exactament NUM_VALORS valors.
        int numValorsLlegits = 0;
        while (numValorsLlegits < NUM_VALORS) {
            //abans de llegir, comprovem si realment hi ha un enter.
            if (lector.hasNextInt()) {
                int valor = lector.nextInt();
                System.out.println(TXT_VALOR + numValorsLlegits + TXT_LLEGIT + valor);
                numValorsLlegits++;
            } else {
            /*
            * i el valor no és enter, es llegeix però s'ignora.
            * no s'avança tampoc el comptador.
            */
                lector.next();
            }
        }
        //els valors que sobrin a la darrera línia escrita es descarten.
        lector.nextLine();
        System.out.println(MSG_2);
    }
}








