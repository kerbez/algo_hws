
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
public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] w = new int[10];
        int[] b = new int[10];
        int[][] g = new int[10][10];
        for(int i = 1; i <= n; i++){
            w[i] = 10000000;
            b[i] = 0;
            for(int j = 1; j <= n; j++){
                g[i][j] = in.nextInt();
            }
        }
        w[1] = 0;
        int ind = maxx(w, b, n);
        while(ind != n){
        System.out.println(ind + " " + w[ind]);
            for(int i = 1;i <= n; i++){
                if(g[ind][i] > 0 && b[i] == 0 && w[ind] + g[ind][i] < w[i]){
                    w[i] = w[ind] + g[ind][i];
                }
            }
            ind = maxx(w, b, n);
            b[ind] = 1;
        
        }
        System.out.println(w[n]);
    }

    private static int maxx(int[] w, int[] b, int n) {
        int ind = 1, ww =1000000;
        for(int i = 1; i <= n; i++){
            if(b[i] == 0){
                ind = i;
                ww = w[ind];
                System.out.println("int max1 " + ind + " " + ww);
                break; 
            }
        }
        for(int i = 1; i <= n; i++){
            if(b[i] == 0 && ww > w[i]){
                ind = i;ww = w[ind];
            }
        }
        return ind;
    }
    
}
