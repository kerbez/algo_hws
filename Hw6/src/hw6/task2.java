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
public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("n = ");
        int n;
        n = in.nextInt();
        int[] ar = new int[n + 10];
        for(int i = 1; i <= n; i++){
            ar[i] = in.nextInt();
        }
        System.out.println("q = ");
        int q = in.nextInt();
        while(q > 0){
            String s = in.next();
            if(s.equals("find")){
                int f = in.nextInt();
                System.out.println(find(ar, f, 1, n));
            }
            if(s.equals("insert")){
                int f = in.nextInt();
                int p = find_for_ins(ar, f, 1, n);
                if(p>0){
                    for(int i = n; i>=p; i--){
                        ar[i + 1] = ar[i];
                    }
                    ar[p] = f;
                    n +=1;
                }
                
            }
            if(s.equals("display")){
                for(int i = 1; i <=n; i++){
                    System.out.print(ar[i] + " ");
                }
                System.out.println();
            }
            q--;
        }
        
        
    }

    private static int find(int[] ar, int f,int l, int r) {
        //System.out.println("here");
        if(r < l){ return -1;}
        int m = (r - l)/2 + l;
        
        if(f < ar[m]){return find(ar, f, l, m - 1);}
        else if(f > ar[m]){return find(ar, f, m + 1, r);}
        return m;
    
    }

    private static int find_for_ins(int[] ar, int f, int l, int r) {
        
        if(r < l){ return l;}
        int m = (r - l)/2 + l;
        if(f < ar[m]){return find_for_ins(ar, f, l, m - 1);}
        else if(f > ar[m]){return find_for_ins(ar, f, m + 1, r);}
        return -1;
    }
}
