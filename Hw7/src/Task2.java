
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
public class Task2 {
    public static void main(String[] args) {
        int n, m, ma = 0, mai = 0, maj = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int[][] a = new int[n + 5][m + 5], b = new int[n + 5][m + 5];
        
        for(int i = 1; i <= n; i++){
            
            for(int j = 1; j <= m; j++){
                if(i == 1){
                    b[0][j] = 0;
                }
                if(j == 1){
                    b[i][0] = 0;
                }
                a[i][j] = in.nextInt();
                b[i][j] = b[i - 1][j] + b[i][j - 1] - b[i - 1][j - 1] + a[i][j];
                if(b[i][j] > ma){
                    ma = b[i][j];
                    System.out.println("ma = " +  ma + " i = " + i + " j = " + j);
                    mai = i;
                    maj = j;
                }
                
            }
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(ma + " " + mai + " " + maj);
    }
    
}
