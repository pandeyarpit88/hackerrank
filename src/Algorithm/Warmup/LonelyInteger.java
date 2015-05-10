package Algorithm.Warmup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by arpit on 10/5/15.
 */
public class LonelyInteger {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner (System.in);
        int N = scanner.nextInt ();
        scanner.nextLine ();
        assert N >=1;
        assert N <=100;
        assert N%2==1;
        String str =scanner.nextLine ();

        String[] strArr = str.split ( " " );
        HashMap<String, Integer> map = new HashMap<String, Integer> ();
        for(String string : strArr) {
            if(map.containsKey ( string )) {
                int count = map.get ( string );
                map.put(string, count+1);
            } else {
                map.put(string, 1);
            }
        }
        for( Map.Entry<String, Integer> e : map.entrySet ()) {
            if(e.getValue () ==1) {
                System.out.println(e.getKey ());
                break;
            }
        }
    }
}
