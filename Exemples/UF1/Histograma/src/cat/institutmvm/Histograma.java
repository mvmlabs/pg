package cat.institutmvm;
    public class Histograma {
      private static final char TXT_STAR = '*';
      private static final String MSG = "Histograma de les notes";
      private static final String TXT_SUSPES = "Suspès:     ";
      private static final String TXT_APROVAT = "Aprovat:    ";
      private static final String TXT_NOTABLE = "Notable:    ";
      private static final String TXT_EXCELLENT = "Excel·lent: ";
      
      public static void main (String[] args) {
        float[] arrayNotes =  {2f, 5f, 9f, 6.5f, 10f, 4.5f, 8.5f, 7f, 6f, 7.5f, 9f, 7f};
        //inicialització dels comptadors per a cada barra del gràfic.
        int[] barres = new int[4];
        //càlcul dels valors, es fa recorren totes les notes.
        for (int i = 0; i < arrayNotes.length; i++) {
          //A quin rang pertany?
          if ((arrayNotes[i] >=0 )&&(arrayNotes[i] < 5)) {
            barres[0]++;
          } else if (arrayNotes[i] < 6.5) {
            barres[1]++;
          } else if (arrayNotes[i] < 9) {
            barres[2]++;
          } else if (arrayNotes[i] <= 10) {
            barres[3]++;
          }
          //Si no pertany a cap rang, nota incorrecta. La ignorem.
        }
        System.out.println(MSG);
        System.out.println("-----------------------------");
        //S'imprimeix el gràfic.
        //Anem recorrent els comptadors i imprimim el valor en estrelles.
        for (int i = 0; i < barres.length; i++) {
          //Aprofitem l'índex per saber quin títol cal escriure a la barra actual.
          switch(i) {
            case 0:
              System.out.print(TXT_SUSPES);
              break;
            case 1:
              System.out.print(TXT_APROVAT);
              break;
            case 2:
              System.out.print(TXT_NOTABLE);
              break;
            case 3:
              System.out.print(TXT_EXCELLENT);
              break;
          }
          //imprimim tantes estrelles com el valor del comptador.
          for (int j = 0; j < barres[i]; j++) {
            System.out.print(TXT_STAR);
          }
          System.out.println();
        }
      }
    }