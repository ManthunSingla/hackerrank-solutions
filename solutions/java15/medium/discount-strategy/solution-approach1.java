// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/oop-lab-mst-29sep-9301245/challenges/discount-strategy/problem?isFullScreen=true
// Problem     Discount Strategy
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-29, 12:22 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

interface DiscountStrategy {
    double getDiscount(double price);
    double getDiscount(int price);
}

class StudentDiscount implements DiscountStrategy {
    public double getDiscount(double price) { return price * 0.10; }
    public double getDiscount(int price) { return price * 0.10; }
}

class FestivalDiscount implements DiscountStrategy {
    public double getDiscount(double price) { return price * 0.20; }
    public double getDiscount(int price) { return price * 0.20; }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next().toUpperCase();
        
        String type = input.replaceAll("[0-9.]", "").trim();
        String priceStr = input.replaceAll("[^0-9.]", "").trim();
        double price = priceStr.isEmpty() ? sc.nextDouble() : Double.parseDouble(priceStr);
        
        DiscountStrategy strategy = type.equals("STUDENT") ? new StudentDiscount() : new FestivalDiscount();
        
        System.out.printf("%.2f\n", strategy.getDiscount(price));
        sc.close();
    }
}
