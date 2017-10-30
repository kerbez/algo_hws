
import static java.lang.Integer.max;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kerbe
 */
public class Task1 {
    public static void main(String[] args) {
        int n, m = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] a = new int[n + 5], b = new int[n+5];
        for(int i = 1; i <= n; i++){
            b[i] = 1;
            a[i] = in.nextInt();
            for(int j = 1; j < i; j++){
                if(a[j] > a[i]){
                    b[i] = max(b[i], b[j] + 1);
                    m = max(m, b[i]);
                }
            }
        }
        System.out.println(m);
    }
    
}
