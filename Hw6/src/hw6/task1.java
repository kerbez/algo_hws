/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;

import java.util.Scanner;

/**
 *
 * @author kerbe
 */
public class task1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int[] ar = new int[n + 2], sortar = new int[n + 2];
        for(int i = 1; i <= n; i++){
            ar[i] = in.nextInt();
            int k = i;
            while(k != 1){
                if(ar[k] > ar[k/2]){
                    int d = ar[k];
                    ar[k] = ar[k/2];
                    ar[k/2] = d;
                    k/=2;
                }
                else break;
            }
        }
        for(int i = 1; i <= n; i++){
            System.out.print(ar[i] + " ");
        }
        int k = n, l = 0;
        while(k > 0){
            int d = ar[1];
            ar[1] = ar[k];
            ar[k] = d;
            sortar[++l] = ar[k];
            k--;
            int cur = 1;
            while(true){
                if(cur + cur > k) break;
                if(cur+cur == k && ar[cur] < ar[cur + cur]){
                    System.out.println();
                    System.out.println("1st");
                    System.out.println("swap(" + ar[cur]+ ", " + ar[cur + cur] + ")");
                    d = ar[cur];
                    ar[cur] = ar[cur + cur];
                    ar[cur + cur] = d;
                    cur = cur + cur;
                    
                }
                else if(cur+cur == k) break;
                else if(ar[cur] < ar[cur + cur] && ar[cur + cur + 1] < ar[cur + cur]){
                    
                    System.out.println();
                    System.out.println("2nd");
                    System.out.println("swap(" + ar[cur]+ ", " + ar[cur + cur] + ")");
                    d = ar[cur];
                    ar[cur] = ar[cur + cur];
                    ar[cur + cur] = d;
                    cur = cur + cur;
                }
                else if(ar[cur] < ar[cur + cur + 1] && ar[cur + cur + 1] > ar[cur + cur]){
                    System.out.println();
                    System.out.println("3rd");
                    
                    System.out.println("swap(" + ar[cur]+ ", " + ar[cur + cur + 1] + ")");
                    d = ar[cur];
                    ar[cur] = ar[cur + cur + 1];
                    ar[cur + cur + 1] = d;
                    cur = cur + cur + 1;
                }
                else break;
            }
            
            System.out.println();

            for(int i = 1; i <= n; i++){
                System.out.print(ar[i] + " ");
            }
        }
        System.out.println();
        System.out.println("finally");
        
        for(int i = 1; i <= n; i++){
            System.out.print(ar[i] + " ");
        }
        // TODO code application logic here
    }

    
    
}
