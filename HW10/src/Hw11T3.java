
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
public class Hw11T3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] g = new int[10][10];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                g[i][j] = in.nextInt();
                if(g[i][j] == 0 && i != j)
                    g[i][j] = 100000000;
            }
        }
        for(int k = 1; k <= n; k++){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    if(g[i][k] + g[k][j] < g[i][j]){
                        g[i][j] = g[i][k] + g[k][j];
                    }
                }
            }
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(g[i][j] + " ");
            }System.out.println();
        }
    }
    
}
