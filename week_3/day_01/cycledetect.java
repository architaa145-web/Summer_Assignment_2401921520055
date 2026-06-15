class Node {
    int data;
    Node next;

    Node (int data){
        this.data = data;
        this.next=null;
    }
}

class LinkedList {
    Node head;

    public boolean hasCycle(Node head){
        Node fast=head;
        Node slow=head;

        while(fast != null && fast.next!= null){
        slow =slow.next;
        fast= fast.next.next;

        if(slow == fast){
            return true;
        }
    }
    return false;
}
}

public class cycledetect  {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);


        list.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next=second;

        System.out.println(list.hasCycle(list.head));

    }
}