// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
// Problem     Java End-of-file
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-26, 01:12 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while ( sc.hasNextLine() ){
            String s = sc.nextLine() ;
            n++ ;
            System.out.println( n + " " + s );
        }
        sc.close();
    }
}
