
import static java.lang.System.exit;
import java.util.LinkedList;
import java.util.Queue;
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
        int fi, fj, si, sj;
        Scanner in = new Scanner(System.in);
        si = in.nextInt();
        sj = in.nextInt();
        fi = in.nextInt();
        fj = in.nextInt();
        int[][] a = new int[10][10];
        bfs(si, sj, fi, fj);
                System.out.println(0);
    }

    private static void bfs(int si, int sj, int fi, int fj) {
        int[][] a = new int[10][10];
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(si*10 + sj);
        a[si][sj] = 0;
        while(!q.isEmpty()){
            int k = q.poll();
            int i = k/10, j = k%10;
            if(a[fi][fj] > 0){
                System.out.println(a[fi][fj]);
                exit(0);
            }
            if(i-2 > 0 && j - 1 > 0 &&a[i - 2][j - 1] == 0){
                q.add((i - 2) * 10 + (j - 1));
                a[i - 2][j - 1] = a[i][j] + 1;
            }
            if(i-2 > 0 && j + 1 > 0 &&a[i - 2][j + 1] == 0){
                q.add((i - 2) * 10 + (j + 1));
                a[i - 2][j + 1] = a[i][j] + 1;
            }
            if(i-1 > 0 && j - 2 > 0 &&a[i - 1][j - 2] == 0){
                q.add((i - 1) * 10 + (j - 2));
                a[i - 1][j - 2] = a[i][j] + 1;
            }
            if(i-1 > 0 && j +2 > 0 &&a[i -1][j +2] == 0){
                q.add((i - 1) * 10 + (j +2));
                a[i - 1][j +2] = a[i][j] + 1;
            }
            if(i+1 > 0 && j - 2 > 0 &&a[i +1][j - 2] == 0){
                q.add((i +1) * 10 + (j - 2));
                a[i +1][j - 2] = a[i][j] + 1;
            }
            if(i+1 > 0 && j +2 > 0 &&a[i +1][j+2] == 0){
                q.add((i +1) * 10 + (j +2));
                a[i +1][j +2] = a[i][j] + 1;
            }
            if(i+2 > 0 && j - 1 > 0 &&a[i + 2][j - 1] == 0){
                q.add((i + 2) * 10 + (j - 1));
                a[i + 2][j - 1] = a[i][j] + 1;
            }
            if(i+2 > 0 && j + 1 > 0 &&a[i + 2][j + 1] == 0){
                q.add((i + 2) * 10 + (j + 1));
                a[i + 2][j + 1] = a[i][j] + 1;
            }
        }
    }
    
}
