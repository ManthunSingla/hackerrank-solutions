// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
// Problem     Java If-Else
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-07-28, 12:28 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if (N % 2 != 0){
            System.out.println("Weird");
        }
        else if(N % 2 == 0 && N <= 20 && N >= 6){
            System.out.println("Weird");
        }
        else if(N % 2 ==0 && N >= 2){
            System.out.println("Not Weird");
        }
        else{
        }
        scanner.close();
    }
}
