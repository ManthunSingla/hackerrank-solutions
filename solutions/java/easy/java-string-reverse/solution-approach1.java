// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
// Problem     Java String Reverse
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-11, 10:07 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String R = "";
        for(int i = A.length() - 1; i >= 0 ; i--){
            R = R + A.charAt(i);  
        }
        if(A.equals(R)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
            }
    }
}
