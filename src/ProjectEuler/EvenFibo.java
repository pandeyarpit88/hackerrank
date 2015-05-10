package ProjectEuler;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by arpit on 10/5/15.
 */
public class EvenFibo {
    public static boolean isPerfectSquare(long num){
        long sqrt = (long)Math.sqrt ( num);
        if(sqrt * sqrt == num )
            return true;
        return false;
    }

    public static boolean isFibo(long num) {
        return (isPerfectSquare ( 5 * num * num + 4) || isPerfectSquare ( 5 * num * num + 4));
    }

    public static void main(String ...args) {
        Scanner s = new Scanner ( System.in );
        int T = s.nextInt ();
        assert T >= 1;
        assert T <=100000;
        BigInteger[]arr = new BigInteger[T];
        for(int i=0; i < T; i++) {
            arr[i] = s.nextBigInteger ();
        }

        BigInteger first = new BigInteger ( "1" );
        BigInteger second = new BigInteger ( "2" );
        BigInteger two = new BigInteger ( "2" );
        BigInteger zero = new BigInteger ( "0" );
        for(BigInteger b : arr) {
            BigInteger sum = new BigInteger ( "0" );
            BigInteger prev2 = first;
            BigInteger prev = second;
            while(prev.compareTo ( b ) == -1) {
                if(prev.remainder ( two ).compareTo( zero ) == 0 )
                    sum = sum.add(prev);
                BigInteger temp = prev.add(prev2);
                prev2 = prev;
                prev = temp;
            }
            System.out.println(sum);
        }
    }
}
