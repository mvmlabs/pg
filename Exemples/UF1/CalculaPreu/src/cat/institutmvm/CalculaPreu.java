/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm;

/**
 *
 * @author reychy
 */
public class CalculaPreu {
    private static final double IVA = 0.21;

    public static void main(String[] args) {
        int preuInicial = 25;
        double preuFinal = 0.0;
        preuFinal = preuInicial + (preuInicial * IVA);
        System.out.println(preuFinal);
    }
}
