package BinarySearchTree;

public class Node {
    private int data;
    private Node leftChild;
    private Node rightChild;

    public Node (int value) {
        data = value;
        leftChild = null;
        rightChild = null;
    }

    public int getData () {
        return data;
    }

    public Node getLeftChild () {
        return leftChild;
    }

    public Node getRightChild () {
        return rightChild;
    }

    public void setLeftChild (Node node) {
        leftChild = node;
    }

    public void setRightChild (Node node) {
        rightChild = node;
    }
}
