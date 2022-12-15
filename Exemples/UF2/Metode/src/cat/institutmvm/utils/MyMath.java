package cat.institutmvm.utils;

/*
* Classe amb utilitats matemàtiques adaptades 
*/
import java.util.Random;

public class MyMath {
        //mètode que retorna la suma dels dos valors globals
    public int sumar(int num1, int num2){
        return num1+num2;
    }
    
    public int random(int bound){
        var rnd = new Random();
        return rnd.nextInt(bound + 1);
    }
}
