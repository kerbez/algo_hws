
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
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        String[] s = new String[n + 5];
        int[] a = new int[n+5];
        int index = 0;
        for(int i = 1; i <= n; i++){
            s[i] = in.next();
            if(Character.isDigit(s[i].charAt(0))){
                a[++index] = Integer.parseInt(s[i]);
            }
            else{
                if(s[i].equals("+")){
                    a[--index] = a[index] + a[index + 1];
                }
                if(s[i].equals("-")){
                    a[--index] = a[index] - a[index + 1];
                }
                if(s[i].equals("/")){
                    a[--index] = a[index] / a[index + 1];
                }
                if(s[i].equals("*")){
                    a[--index] = a[index] * a[index + 1];
                }
            }
        }
        System.out.println(a[index]);
        
        
    }
    
}
