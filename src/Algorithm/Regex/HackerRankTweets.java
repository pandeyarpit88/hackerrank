package Algorithm.Regex;

import java.util.Scanner;

/**
 * Created by arpit on 11/5/15.
 */
public class HackerRankTweets {
    public static void main(String []args) {
        //<char><char><char><char><char><digit><digit><digit><digit><char>
        Scanner s = new Scanner (System.in);
        int T = s.nextInt ();
        s.nextLine ();
        String []strArr = new String[T];
        for(int i=0; i<T; i++) {
            strArr[i] = s.nextLine ();
        }
        String pattern = ".*[hH][aA][kK][eE][rR][rR][aA][nN][kK]";
        for(int i=0; i<T; i++) {
            //System.out.print ( strArr[i] + "==> " );
            if ( strArr[i].matches ( pattern ) ) {
                System.out.println ( "YES" );
            } else {
                System.out.println ( "NO" );
            }
        }
    }
}
