// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/oop-lab-mst-29sep-9301245/challenges/sum-of-fibonacci-numbers-4/problem?isFullScreen=true
// Problem     Sum of Fibonacci Numbers 4
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-29, 12:09 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        if( n >= 2){
            arr[0] = 0;
            arr[1] = 1;
            for( int i = 2 ; i < n ; i++ ){
                arr[i] = arr[i - 1] + arr[i - 2] ;
                sum += arr[i];
            }
            sum = sum + 1 ;
            System.out.println( sum );
        }
        else if ( n == 0) System.out.println( sum );
        else if ( n == 1) System.out.println( sum + 1 );
        
        sc.close();
    }
}
