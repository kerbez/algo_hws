
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
public class task1 {
    public static void main(String[] args) {
        int[][] a = new int[10][10];
        int[] b = new int[10];
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){
            
            for(int j = 1; j <=n; j++){
                a[i][j] = in.nextInt();
                b[i] += a[i][j];
                b[j] += a[i][j];
            }
        }
        for(int i = 1; i <= n; i++){
            System.out.print(b[i] + " ");
        }
    }
    
}
