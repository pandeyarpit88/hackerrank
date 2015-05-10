package Algorithm.Warmup;

import java.util.Scanner;

/**
 * Created by arpit on 10/5/15.
 */
public class FindDigits {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner (System.in);
        int T = scanner.nextInt ();
        assert T >= 1;
        assert T <=15;
        int []num = new int[T];
        for(int i=0; i<T;i++) {
            int N = scanner.nextInt ();
            assert N > 0;
            assert N <= 999999999;
            int temp = N;
            int count = 0;
            while(temp!=0) {
                int div = temp % 10;
                if(div != 0 && N % div == 0) {
                    count++;
                }
                temp = temp/10;
            }
            num[i] = count;
        }
        for(int i =0; i<T;i++)
            System.out.println(num[i]);
    }
}
