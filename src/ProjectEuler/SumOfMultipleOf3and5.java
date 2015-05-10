package ProjectEuler;

import java.util.Scanner;

/**
 * Created by arpit on 10/5/15.
 */
public class SumOfMultipleOf3and5 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        assert T >=1;
        assert T<=100000;
        long []numArr = new long[T];
        for(int i=0; i<T; i++) {
            numArr[i] = scanner.nextLong ();
            assert numArr[i]>=1;
            assert numArr[i]<=1000000000;
        }

        for (long num : numArr) {
            int i=1;
            long sum=0;
            while(i*3<num) {
                sum +=i*3;
                if(i*5<num && i%3!=0)
                    sum +=i*5;
                i++;
            }
            System.out.println(sum);
        }
    }
}
