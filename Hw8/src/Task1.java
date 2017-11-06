
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
        int n, w;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        w = in.nextInt();
        int[] p = new int[n + 5];
        for(int i = 1; i <=n; i++){
            p[i] = in.nextInt();
        }
        int[][] a = new int[n + 5][w + 5];
        for(int i = 1; i <=n; i++){
            if(i == 1)
            a[i][0] = 0;
            for(int j = 1; j <= w; j++){
                if(j == 1) a[0][j] = 0;
                
                if(j - p[i] >= 0){
                    System.out.println("here " + j + " - " + p[i] + " = " + (j - p[i]));
                    System.out.println(a[i - 1][j] + " " + (a[i - 1][j - p[i]] + p[i]));
                    a[i][j] = maax(a[i - 1][j], a[i - 1][j - p[i]] + p[i]);
                }
                else a[i][j] = a[i - 1][j];
            }
        }
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= w; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(a[n][w]);
    }

    private static int maax(int a, int b) {
        if(a > b){
            return a;
        }
        return b;
    }
    
}
