package Algorithm.Strings;

import java.util.Scanner;

/**
 * Created by arpit on 10/5/15.
 */
public class AlternatingCharecters {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner ( System.in );
        int testCases = scanner.nextInt ();
        scanner.nextLine ();
        String[] str = new String[testCases];
        int[] del= new int[testCases];
        for(int i=0; i<testCases; i++) {
            str[i] = scanner.nextLine ();
            char []a = str[i].toCharArray ();
            char prevChar = ' ';
            int j=0;
            for(char c :a) {
                if(prevChar == c) {
                    j++;
                    continue;
                }
                prevChar = c;
            }
            del[i]= j;
        }
        for(int i=0; i<testCases; i++)
            System.out.println(del[i]);
    }
}
