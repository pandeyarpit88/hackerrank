package Algorithm.Warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by arpit on 10/5/15.
 */
public class MaxMin {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
        int N = 0;
        try {
            N = Integer.parseInt(in.readLine ());
        } catch (IOException e) {
            e.printStackTrace ();
        }

        assert N >=2;
        assert N<= 100000;

        int K=0;
        try {
            K = Integer.parseInt(in.readLine());
        } catch (IOException e) {
            e.printStackTrace ();
        }
        assert K>=2;
        assert K<=N;

        int[] list = new int[N];

        for(int i = 0; i < N; i ++)
            try {
                list[i] = Integer.parseInt(in.readLine());
                assert list[i] >=0;
                assert list[i] <= 1000000000;
            } catch (IOException e) {
                e.printStackTrace ();
            }

        Arrays.sort ( list );
        int unfairness = list[K-1] - list[0];
        for(int i=K--; i<N; i++) {
            int cur = list[i] - list[i-K];
            unfairness = cur < unfairness ? cur : unfairness;
        }

        System.out.println(unfairness);
    }
}
