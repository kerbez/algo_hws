
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kerbe
 */
public class Task3 {
    public static void main(String[] args) {
        int n;
        Stack<Integer> s = new Stack<Integer>(); 
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int siz = 0, last = -1;
        int[] a = new int[n + 5];
        for(int i = 1; i <= n; i++){
            a[i] = in.nextInt();
            while(!s.empty() && a[s.peek()] < a[i]){
                int x = s.pop();
                a[x] = a[i];
            }
            s.push(i);
        }
        while(!s.empty()){
            int x = s.pop();
            a[x] = 0;
        }
        for(int i = 1 ; i <= n; i++){
            System.out.print(a[i] + " ");
        }
    }
    
}
