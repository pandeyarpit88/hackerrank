package ProjectEuler;

import java.util.Scanner;

/**
 * Created by arpit on 10/5/15.
 */
public class SumSquareDiff {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner (System.in);
        int T = scanner.nextInt();
        assert T >=1;
        assert T<=10000;
        long []numArr = new long[T];
        for(int i=0; i<T; i++) {
            numArr[i] = scanner.nextInt();
            assert numArr[i]>=1;
            assert numArr[i]<=10000;
        }

        for(int i=0;i<T;i++) {
            long n = numArr[i];
            long  sumOfSquare = n*(n+1)*(2*n+1)/6;
            long squareOfSum = (long)Math.pow(n*(n+1)/2, 2);
            System.out.println(squareOfSum - sumOfSquare);
        }
    }
}
