package exam;

import java.util.Iterator;

/**
 * Created by dennis on 10/5/16.
 */
public class LinkedListDemo implements Iterable<ListNode>{

    ListNode root;

    public static void main(String[] args) {
        LinkedListDemo llDemo = new LinkedListDemo();
        llDemo.add(new ListNode(1, "One"));
        llDemo.add(new ListNode(2, "Two"));
        llDemo.add(new ListNode(3, "Three"));
         Iterator it = llDemo.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

       // llDemo.traverse();
    }

    public void add(ListNode node) {
        if (node != null
                ) {

            if (root == null) {
                root = node;
                return;
            }

            ListNode currentNode = root;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = node;
        }
    }

    public void traverse() {
        if (root != null) {
            ListNode currentNode = root;
            while(currentNode.next != null) {
                System.out.println(currentNode);
                currentNode = currentNode.next;
            }
        }
    }

    @Override
    public Iterator<ListNode> iterator() {
        return new Iterator<ListNode>() {

            ListNode current = root;

            @Override
            public boolean hasNext() {
                return current.next != null;
            }

            @Override
            public ListNode next() {
                current = current.next;
                return current;
            }
        };
    }
}

class ListNode {
    final int key;
    final String value;
    ListNode next;

    public ListNode(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public String toString() {
        return "key:" + key + " value:" + value;
    }
}
