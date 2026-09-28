// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/lab-mst8th-oct/challenges/singly-linked-list-17-1/problem?isFullScreen=true
// Problem     Singly linked list 17
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-09-28, 03:13 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    public void insertAtEnd(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAtBeginning(int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
    }

    public void deleteAtPosition(int p) {
        if (p < 1 || head == null) {
            return;
        }
        if (p == 1) {
            head = head.next;
            return;
        }
        
        Node current = head;
        for (int i = 1; i < p - 1 && current != null; i++) {
            current = current.next;
        }
        
        if (current == null || current.next == null) {
            return;
        }
        
        current.next = current.next.next;
    }

    public void printList() {
        if (head == null) {
            System.out.println("EMPTY");
            return;
        }
        
        Node current = head;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        System.out.println(sb.toString().trim());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int Q = scanner.nextInt();
        
        SinglyLinkedList list = new SinglyLinkedList();
        
        for (int i = 0; i < Q; i++) {
            int type = scanner.nextInt();
            switch (type) {
                case 1:
                    list.insertAtEnd(scanner.nextInt());
                    break;
                case 2:
                    list.insertAtBeginning(scanner.nextInt());
                    break;
                case 3:
                    list.deleteAtPosition(scanner.nextInt());
                    break;
                case 4:
                    list.printList();
                    break;
            }
        }
        scanner.close();
    }
}
