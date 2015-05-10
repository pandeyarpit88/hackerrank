package Algorithm.Strings;

import java.util.Scanner;

/**
 * Created by arpit on 10/5/15.
 */
public class Panagram {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner ( System.in );
        String str = scanner.nextLine ().toLowerCase ();
        boolean panagramFlag = true;
        for(char i='a'; i < 'z'; i++) {
            if(!str.contains ( String.valueOf(i) )) {
                panagramFlag =false;
                break;
            }
        }
        if(panagramFlag==true) {
            System.out.println ( "pangram" );
        } else {
            System.out.println ( "not pangram" );
        }
    }
}
