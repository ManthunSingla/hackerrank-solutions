// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?isFullScreen=true
// Problem     Java 1D Array
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-26, 11:50 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for( int  i = 0 ; i < arr.length ; i++ ){
            arr[i] = sc.nextInt();
        }
        for( int  i = 0 ; i < arr.length ; i++ ){
            System.out.println( arr[i] );
        }
    }
}
