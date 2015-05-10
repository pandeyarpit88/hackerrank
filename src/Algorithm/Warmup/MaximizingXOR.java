package Algorithm.Warmup;

import java.util.Scanner;

/**
 * Created by arpit on 10/5/15.
 */
public class MaximizingXOR {
    public static int xor(int a, int b) {
        return a^b;
    }

    public static void main(String ...args) {
        Scanner scanner = new Scanner ( System.in );
        int firstInput = scanner.nextInt ();
        int secondInput = scanner.nextInt ();
        int max = 0;
        for(int i=firstInput; i<= secondInput; i++) {
            for ( int j=i; j <=secondInput; j++ ) {
                int xor = xor(i,j);
                if(max<xor) max=xor;
            }
        }
        System.out.println(max);
    }
}
