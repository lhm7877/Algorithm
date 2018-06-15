package chapter4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <pre>
 * Created by lhm0805 on 2018-06-15.
 * </pre>
 */
public class PrimeFactorization {
    public static void main(String[] args){
        List<Integer> factor = factor(12);
        System.out.println(factor);
    }
    private static List<Integer> factor(Integer n){
        if(n == 1){
            return Collections.singletonList(1);
        }
        List<Integer> ret = new ArrayList<>();
        for(int div = 2; n>1; ++div){
            while( n % div == 0){
                n /= div;
                ret.add(div);
            }
        }
        return ret;
    }
}
