/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author kerbe
 */
public class Hw2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int uv[] = new int[n*n + 2];
        int uh[] = new int[n*n + 2];
        int a[][] = new int[n*n + 2][n*n + 2];
        // TODO code application logic here
        for(int i = 1; i <= n*n; i++){
            for(int j = 1; j <= n*n; j++){
                a[i][j] = in.nextInt();
            }
            uv[i] = 0;
            uh[i] = 0;
        }
        for(int i = 1; i <= n*n; i++){
            for(int j = 1; j <= n*n; j++){
                uv[a[j][i]] = 1;
                uh[a[i][j]] = 1;
            }
            for(int j = 1; j <= n*n; j++){
                if(uv[j] == 0 || uh[j]==0){
                    System.out.println("incorrect");
                    exit(0);
                }
                uv[j] = 0; uh[j] = 0;
            }
        }
        for(int i = 1; i < n*n; i+=n){
            for(int j = 1; j < n*n; j+=n){
                for(int ii = i; ii < i+n; ii++){
                    for(int jj = j; jj < j + n; jj++){
                        uv[a[ii][jj]] = 1;
                    }
                }
                for(int ii = 1; ii <= n*n; ii++){
                    if(uv[ii] == 0){
                        System.out.println("incorrect");
                        exit(0);
                    }
                    uv[ii] = 0;
                }
            }
        }
        System.out.println("Correct");
        
    }
    
}
