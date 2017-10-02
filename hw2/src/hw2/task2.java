/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author kerbe
 */
public class task2 {
    public static void main(String[] args) {
        System.out.println("task2");
        Map<Integer, Integer> tm = new TreeMap<>();
        Scanner in = new Scanner(System.in);
        int n, t1, t2;
        String s, s1;
        n = in.nextInt();
        int[] ts = new int[n*2 + 5];
        for(int i = 1; i <=n; i++){
            s = in.next();
            s1 = in.next();
            if(s.length() == 5){
            t1 = (s.charAt(0)-'0')*600 + (s.charAt(1)-'0')*60 + (s.charAt(3) -'0')*10 + (s.charAt(4)-'0');}
            else{
            t1 = (s.charAt(0)-'0')*60 + (s.charAt(2) -'0')*10 + (s.charAt(3)-'0');
                
            }
            if(s1.length() == 5)
            t2 = (s1.charAt(0)-'0')*600 + (s1.charAt(1)-'0')*60 + (s1.charAt(3) -'0')*10 + (s1.charAt(4)-'0');
            else
            t2 = (s1.charAt(0)-'0')*60 + (s1.charAt(2) -'0')*10 + (s1.charAt(3)-'0');
            
            tm.put(t1, 0);
            tm.put(t2, 0);
            ts[i*2 - 1] = t1;
            ts[i*2] = t2;
        }
        int m = 0;
        for(int i = 1; i <= n; i++){
            int k = 0;
            System.out.println(ts[i * 2 - 1] + " " + ts[i * 2]);
            for(Map.Entry<Integer, Integer> en : tm.entrySet()){
                System.out.print(en.getKey() + " ");
                if(en.getKey() >= ts[i * 2 - 1] && en.getKey() <= ts[i * 2]){
                    k = 1;
                    en.setValue(en.getValue() + 1);
                    if(en.getValue()>m) m = en.getValue();
                }
                else if(k == 1) {
                    k = 0;
                    break;
                }
                System.out.println(en.getValue());
            }
        }
        
        for(Map.Entry<Integer, Integer> en : tm.entrySet()){
            System.out.println(en.getKey() + " " + en.getValue());
        }
        System.out.println(m);
    }
    
}
