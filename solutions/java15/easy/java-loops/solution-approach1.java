// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
// Problem     Java Loops II
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-26, 11:15 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q;
        q = sc.nextInt();
        int a[] = new int[q];
        int b[] = new int[q];
        int n[] = new int[q];
        for(int i = 0 ; i < q ; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            n[i] = sc.nextInt();
            int ans[] = new int[q];
            ans[i] = 0;
            
            for(int j = 0 ; j < n[i] ; j++){
                int m = (int)Math.pow(2, j);
                ans[i] += (m * b[i]);
                System.out.print( ans[i] + a[i] + " ");
            }
            System.out.println();
        
    }
}
}
