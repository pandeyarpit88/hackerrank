package Algorithm.Warmup;

import java.util.Scanner;

/**
 * Created by arpit on 10/5/15.
 */
public class UtopianTree {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner ( System.in );
        int numberOfInputs = scanner.nextInt ();
        int testCases[] = new int[numberOfInputs];
        for(int i=0; i<numberOfInputs; i++)
            testCases[i] = scanner.nextInt ();


        for(int i : testCases) {
            int height=0;
            for(int j=0; j<=i;j++) {
                if ( j % 2 == 0 )
                    height += 1;
                else
                    height = height * 2;
            }
            System.out.println(height);
        }
    }
}
