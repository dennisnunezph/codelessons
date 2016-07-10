package lessons.exam.binary;

/**
 * Created by dennis on 6/30/16.
 */
public class BinaryTreeDemo {

     Node root;

    public static void main(String[] args) {

        BinaryTreeDemo bt = new BinaryTreeDemo();

        bt.addNode(50, "Boss");
        bt.addNode(25, "Vice Pres");
        bt.addNode(15, "Office Manager");
        bt.addNode(30, "Secretary");
        bt.addNode(75, "Sales Manager");
        bt.addNode(85, "Salesman 1");

        bt.inOrderTraverseTree(bt.root);
    }

    public void inOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);

        }
    }

    public void addNode(int key, String name) {
        Node newNode = new Node(key, name);
        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;
            int focusKey = 0;
            while(true) {
                parent = focusNode;
                focusKey = focusNode.key;
                focusNode = (key < focusKey) ? focusNode.leftChild : focusNode.rightChild;

                if (key < focusKey) {
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void addNode1(int key, String name) {
        Node newNode = new Node(key, name);
        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;
            while(true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }


}

class Node {
    int key;
    String name;

    Node leftChild;
    Node rightChild;

    Node(int key, String name) {
        this.key =  key;
        this.name = name;
    }

    public String toString() {
        return name + " has a key " + key;
    }

}
