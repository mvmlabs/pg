package cat.institutmvm;

public class IniciaArray {

    public static void main(String[] args) {
        int[] arrayEnters = new int[20];
        int i;
        for (i = 0; i < arrayEnters.length; i++) {
            arrayEnters[i] = i + 2;
        }
        for (i = 0; i < arrayEnters.length; i++) {
            System.out.print(arrayEnters[i] + " ");
        }
        System.out.println();
    }   
}
