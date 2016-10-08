package exam;

/**
 * Created by dennis on 7/12/16.
 */
public class TraverseNodeDemo {

    public static void main(String[] args) {

        TraverseNodeDemo tdemo = new TraverseNodeDemo();

        tdemo.add(1, "|One");
        tdemo.add(3, "Three");
        tdemo.add(2, "Two");

        tdemo.traverse(tdemo.root);

    }


    Node root;

    public void add(int key, String value) {
        Node newNode = new Node(key, value);

        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;

            while(true) {
                parent = focusNode;


                if (key < focusNode.key) {
                    focusNode = parent.left;
                    if (focusNode == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    focusNode = parent.right;
                    if (focusNode == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }

        }
}



public  void traverse(Node focusNode) {
    if (focusNode != null) {
        traverse(focusNode.left);
        traverse(focusNode.right);
        System.out.println(focusNode);
    }
}

}
class Node {
    final int key;
    final String value;
    Node left;
    Node right;


    public Node(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public String toString() {
        return "key:" + key + " value:" + value;

    }
}

