package lessons.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by dennis on 6/28/16.
 */
public class LinkedListManual {

    private static int counter;
    private Node head;


    public void add(String data) {
        if (head == null) {
            head = new Node(data);
        }

        Node crunchifyTemp = new Node(data);
        Node crunchifyCurrent = head;

        // Let's check for NPE before iterate over crunchifyCurrent
        if (crunchifyCurrent != null) {

            // starting at the head node, crawl to the end of the list and then add element after last node
            while (crunchifyCurrent.getNext() != null) {
                crunchifyCurrent = crunchifyCurrent.getNext();
            }

            // the last node's "next" reference set to our new node
            crunchifyCurrent.setNext(crunchifyTemp);
        }


    }

    public Iterator<String> iterator() { return new LinkedListIterator(); }

    private class LinkedListIterator implements Iterator<String> {
        private Node current = head;

        public String next() {
            if (!hasNext()) { throw new NoSuchElementException(); }
            String item = current.data;
            current = current.next;
            return item;
        }

        public boolean hasNext() { return current != null; }

        public void remove() { throw new UnsupportedOperationException(); }
    }

    private class Node {
        Node next;
        String data;

        public Node(Node next, String data) {
            this.next = next;
            this.data = data;
        }

        public Node(String data) {
            this.data = data;
        }


        public Node getNext() {
            return next;
        }

        public void setNext(Node nextValue) {
            next = nextValue;
        }
    }
}
