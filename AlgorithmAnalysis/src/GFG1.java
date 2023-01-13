

import java.io.*;
import java.lang.*;
import java.util.*;

import java.util.Random;


public class GFG1 {

Node head;

public GFG1(){

}
    // Funksioni i perdorur pwr mergeSort
    public Node mergeSort(Node head) {
        if (head.next == null) {
            return head;
        }

        Node mid = findMid(head);
        Node head2 = mid.next;
        mid.next = null;
        Node newHead1 = mergeSort(head);
        Node newHead2 = mergeSort(head2);
        Node finalHead = merge(newHead1, newHead2);

        return finalHead;
    }

    // Function to merge two linked lists
    public Node merge(Node head1, Node head2) {
        Node merged = new Node(-1);
        Node temp = merged;

        // Perderisa head1 nuk eshte null dhe head2 nuk eshte
         
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // Perderisa head1 nuk eshte null
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        // Perderisa head2 nuk eshte null
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return merged.next;
    }

    // Gjetja e mesit duke perdorur The Tortoise and The Hare 
    public Node findMid(Node head) {
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // printimi i listes
    public void printList() {
        while (this.head != null) {
            System.out.print("\n" + this.head.data + " ");
            this.head = this.head.next;
        }
    }

    public void addList(int[] numbers) {

        Node head = new Node(numbers[0]);
        Node temp = head;
        for (int i = 1; i < numbers.length; i++) {
            temp.next = new Node(numbers[i]);
            temp = temp.next;
        }
        
   this.head=mergeSort(head);
    }

}
