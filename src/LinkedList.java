import java.util.*;

class Node{
    int data;
    Node next=null;

    public Node(int i){
        data=i;
    }
    public Node(int i, Node n){
        data=i;
        next=n;
    }
}
public class LinkedList {

    public static void main(String[] args) {
        Random rand = new Random();
        Node head = new Node(rand.nextInt(10));
        Node curr = head;
        for (int i = 0; i < 9; i++) {
            Node temp = new Node(rand.nextInt(10));
            curr.next = temp;
            curr = curr.next;
        }

        //print
        curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }

        //inserts a node with 20 at the head
        curr = head;
        Node head1 = new Node(20, curr);
        head=head1;

        //inserts a node with 40 at the end
        Node prev1 = head;
        curr = head.next;
        Node newNode = new Node(40, null);
        while (curr != null) {

            prev1 = prev1.next;
            curr = curr.next;
        }
        newNode.next = curr;
        prev1.next = newNode;

        curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }

        //inserts a node with 60 as the fourth node
        Node prev = head;
        curr = head.next;
        Node newNode1 = new Node(60, null);
        for (int i = 1; i < 3; i++) {
            prev = prev.next;
            curr = curr.next;
        }
        Node temp = curr;
        prev.next = newNode1;
        newNode1.next = temp;

        curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }

        //deletes x value
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        prev = head1;
        curr = head1.next;
        while (curr != null) {
            if (prev.data == x) {
                prev.next = curr.next;
                System.out.println(x + " was deleted.");
                return;
            }
            prev = prev.next;
            curr = curr.next;
        }
        System.out.println("Value was not found.");
    }
}