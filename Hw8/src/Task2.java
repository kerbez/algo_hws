
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
public class Task2 {
    public static void main(String[] args) {
        int n, m;
        Scanner inn = new Scanner(System.in);
        n = inn.nextInt();
        m = inn.nextInt();
        int[][] a = new int[n + 5][m + 5];
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= m; j++){
                a[i][j] = inn.nextInt();
                if(j > 1){
                    int r = a[i][j - 1];
                    int ru = a[i + 1][j - 1];
                    int rd = a[i - 1][j - 1];
                    a[i][j] = a[i][j] + maxx(r, ru, rd);
                }
            }
        }
        for(int i = 1; i <=n; i ++){
            for(int j = 1; j <= m ; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println(a[n][m]);
    }

    private static int maxx(int r, int ru, int rd) {
        if(r >= ru && r >= rd){
            return r;
        }
        if(ru >= r && ru >= rd){
            return ru;
        }
        return rd;
    }
    
}
