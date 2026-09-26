// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-int-to-string/problem?isFullScreen=true
// Problem     Java Int to String
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-26, 11:37 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s;
        if( n <= 100 && n >= -100 ){
            s = "" + n;
            System.out.println("Good job");
        }else System.out.println("Wrong answer");
        
        sc.close();
    }
}
