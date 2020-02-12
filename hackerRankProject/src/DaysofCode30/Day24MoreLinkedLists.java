package DaysofCode30;

import java.io.*;
import java.util.*;

class Node1 {
	int data;
	Node1 next;

	Node1(int d) {
		data = d;
		next = null;
	}

}

public class Day24MoreLinkedLists {

	

	public static Node1 removeDuplicates(Node1 head) {
		// Write your code here
		LinkedList<Integer> queue = new LinkedList<Integer>();
		int cont = 0;
		while(head != null) {
			if(!queue.contains(head.data)) {
				queue.add(head.data);
				cont ++;
			}
			head = head.next;
		}
		head = null;
		while(cont-->0)
			head = insert(head, queue.poll());
		return head;
	}

	public static Node1 insert(Node1 head, int data) {
		Node1 p = new Node1(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node1 start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(Node1 head) {
		Node1 start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node1 head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		sc.close();
		//display(head);
		head = removeDuplicates(head);
		display(head);

	}
}
	/*
6
1
2
2
3
3
4
*/