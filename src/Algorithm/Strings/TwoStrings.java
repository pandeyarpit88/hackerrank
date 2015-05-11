package Algorithm.Strings;

import java.util.Scanner;

/**
 * Created by arpit on 11/5/15.
 */
public class TwoStrings {
    public static void main(String []args) {
        Scanner scanner = new Scanner ( System.in );
        int T = scanner.nextInt ();
        assert T>=1;
        assert T<=10;
        scanner.nextLine ();
        String []strArr = new String[T*2];
        for(int i=0; i < T*2; i++) {
            strArr[i] = scanner.nextLine ();
        }

        for(int i=0; i<T*2;) {
            String str = strArr[i].replaceAll ( "[^" + strArr[i+1] + "]", "" );
            if(str.length() > 0) {
                System.out.println ( "YES" );
            } else {
                System.out.println ( "NO" );
            }
            i+=2;
        }
    }
}
