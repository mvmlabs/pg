package cat.institutmvm.entities;

import cat.institutmvm.contracts.LoveCalculator;

public class BasicLoveCalculator implements LoveCalculator{

    @Override
    public int getCompatibilityBetween(String name1, String name2) {
        var sum1 = 0.0;
        for(char c : name1.toCharArray()){
            sum1 += (int)c;
        }
        
        var sum2 = 0.0;
        for(char c : name2.toCharArray()){
            sum2 += (int)c;
        }
        
        return (sum1 <= sum2) ? (int)((sum1/sum2) * LoveCalculator.MAX_VALUE) : (int)((sum2/sum1) * LoveCalculator.MAX_VALUE);
    }
    
}
