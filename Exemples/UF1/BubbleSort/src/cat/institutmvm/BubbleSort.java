package cat.institutmvm;

public class BubbleSort {

    public static void main(String[] args) {
        float[] llistaNotes = {5.5f, 9f, 2f, 10f, 4.9f};
        /* bucle extern.
        * s'anirà posant a cada posició tractada, començant per la 0, 
        * el valor més baix que es trobi.
        */
        for (int i = 0; i < llistaNotes.length - 1; i++) {
        // bucle intern, cerquem entre la resta de posicions quin és el valor més baix
            for (int j = i + 1; j < llistaNotes.length; j++) {
                //si la posició tractada té un valor més alt que el de la cerca, els intercanviem
                if (llistaNotes[i] > llistaNotes[j]) {
                    //per intercanviar valors cal una variable auxiliar
                    float canvi = llistaNotes[i];
                    llistaNotes[i] = llistaNotes[j];
                    llistaNotes[j] = canvi;
                }
            }
        }
        //mostrem per pantalla.
        System.out.print("L'array ordenat és: ");
        for (int i = 0; i < llistaNotes.length; i++) {
            System.out.print(llistaNotes[i] + " ");
        }
        System.out.println();
    }
}
