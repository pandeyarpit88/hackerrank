package ProjectEuler;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by arpit on 10/5/15.
 */
public class GratestPrime {
    static BigInteger  sqrt(BigInteger n) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = new BigInteger(n.shiftRight(5).add(new BigInteger("8")).toString());
        while(b.compareTo(a) >= 0) {
            BigInteger mid = new BigInteger(a.add(b).shiftRight(1).toString());
            if(mid.multiply(mid).compareTo(n) > 0) b = mid.subtract(BigInteger.ONE);
            else a = mid.add(BigInteger.ONE);
        }
        return a.subtract(BigInteger.ONE);
    }

    public static void maxPrimeFactor(BigInteger n) {
        BigInteger zero = new BigInteger ( "0" );
        BigInteger two = new BigInteger ( "2" );
        BigInteger maxRemainder = zero;
        //BigInteger n1 = n;

        while (n.remainder ( two ).compareTo ( zero ) == 0) {
            n = n.divide ( two );
            maxRemainder = two;
        }

        for (BigInteger i = new BigInteger ( "3" ); sqrt (  n).compareTo ( i ) >=0; i = i.add(two)) {
            while (n.remainder ( i ).compareTo ( zero ) == 0) {
                maxRemainder = i;
                n = n.divide ( i );
            }
        }
        if (n.compareTo ( two ) >=0) {
            maxRemainder = n;
        }
        System.out.println(maxRemainder);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner ( System.in );
        int T = s.nextInt ();
        assert T >= 1;
        assert T <=100000;
        BigInteger[]arr = new BigInteger[T];
        for(int i=0; i < T; i++) {
            arr[i] = s.nextBigInteger ();
            assert arr[i].compareTo (new BigInteger("10")) >= 0;
            assert arr[i].compareTo (new BigInteger("1000000000000")) <= 0;
        }

        for(BigInteger num : arr) {
            maxPrimeFactor( num );
        }
    }
}
