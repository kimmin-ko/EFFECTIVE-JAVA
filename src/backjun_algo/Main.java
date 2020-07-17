package backjun_algo;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private static int n;
    private static int[] p;

    private static void input() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(br.readLine());
            p = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());

            int i = 0;
            while(st.hasMoreTokens())
                p[i++] = Integer.parseInt(st.nextToken());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        input();



        System.out.println(sum());
    }

    private static int sum() {

        int result = 0;
        for(int j = 5; j > 0; j--)
            for(int k = 0; k < j; k++)
                result += p[k];

        return result;
    }



}