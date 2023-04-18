package cat.institutmvm.contracts;

import java.util.Random;

@FunctionalInterface
public interface LoveCalculator {
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 100;
    
    public abstract int getCompatibilityBetween(String name1, String name2);
    
    public default int getInCompatibilityBetween(String name1, String name2){
        var rnd = new Random();
        return rnd.nextInt(LoveCalculator.MAX_VALUE + 1);
    }  
}
