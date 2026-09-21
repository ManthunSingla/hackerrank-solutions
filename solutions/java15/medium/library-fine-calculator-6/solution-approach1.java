// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/oop-graded-assessment2-15sep-9301245/challenges/library-fine-calculator-6/problem?isFullScreen=true
// Problem     Library Fine Calculator 6
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-22, 12:03 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

abstract class Member {
    int id;
    String name;
    int days;
    
    abstract void show();
}


class Student extends Member {
    void show() {
        System.out.println("Member ID: " + id);
        System.out.println("Member Name: " + name);
        System.out.println("Member Type: Student");
        System.out.println("Late Days: " + days);
        System.out.printf("Fine: %.2f\n", (double)(days * 5));
    }
}


class Faculty extends Member {
    void show() {
        System.out.println("Member ID: " + id);
        System.out.println("Member Name: " + name);
        System.out.println("Member Type: Faculty");
        System.out.println("Late Days: " + days);
        System.out.printf("Fine: %.2f\n", (double)(days * 2));
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String type = sc.nextLine();
        int id = Integer.parseInt(sc.nextLine());
        String name = sc.nextLine();
        int days = Integer.parseInt(sc.nextLine());
        
        if (type.equalsIgnoreCase("S")) {
            Student s = new Student();
            s.id = id;
            s.name = name;
            s.days = days;
            s.show();
        } else {
            Faculty f = new Faculty();
            f.id = id;
            f.name = name;
            f.days = days;
            f.show();
        }
        
        sc.close();
    }
}
