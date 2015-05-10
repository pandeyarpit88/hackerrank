package Algorithm.Strings;

import java.util.Scanner;

/**
 * Created by arpit on 10/5/15.
 */
public class FunnyString {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner ( System.in );
        int T = scanner.nextInt ();
        scanner.nextLine();
        assert 1<=T;
        assert T<=10;

        String strings[] = new String[T];
        for(int i=0; i< T; i++) {
            strings[i] = scanner.nextLine ();

            assert (strings[i].length () >=2 && strings[i].length ()<=10000);
        }

        for(int i=0; i< T; i++)  {
            String str = new StringBuffer ( strings[i]).reverse().toString ();
            String output = "";
            for(int j=1; j<str.length (); j++) {
                if (( ( strings[ i ].charAt ( j ) - strings[ i ].charAt ( j - 1 ) ) == ( str.charAt ( j ) - str.charAt ( j - 1 ) ) || (-( strings[ i ].charAt ( j ) - strings[ i ].charAt ( j - 1 ) ) == ( str.charAt ( j ) - str.charAt ( j - 1 ) ))) ) {
                    output = "Funny";
                } else {
                    output = "Not Funny";
                    break;
                }
            }
            System.out.println(output);

        }
    }
}
