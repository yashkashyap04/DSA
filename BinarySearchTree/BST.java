package BinarySearchTree;

public class BST {
    private Node root;
    
    public BST () {
        root = null;
    }

    public Node getRootNode () {
        return root;
    }

    public void insertNode (Node rootNode, int value) {
        if (rootNode != null) {
            if (value < rootNode.getData()){
                if (rootNode.getLeftChild() != null) {
                    rootNode = rootNode.getLeftChild();
                    insertNode(rootNode, value);
                }
                else {
                    Node newNode = new Node (value);
                    rootNode.setLeftChild(newNode);
                }
            }
            else {
                if (rootNode.getRightChild() != null) {
                    rootNode = rootNode.getRightChild();
                    insertNode(rootNode, value);
                }
                else {
                    Node newNode = new Node (value);
                    rootNode.setRightChild(newNode);
                }
            }
        }
        else {
            root = new Node (value);
        }
    }

    public void preOrderTraversal (Node rootNode) {
        if (rootNode != null) {
            System.out.print(rootNode.getData() + " ");
            preOrderTraversal(rootNode.getLeftChild());
            preOrderTraversal(rootNode.getRightChild());
        }
    }

    public void postOrderTraversal (Node rootNode) {
        if (rootNode != null) {
            postOrderTraversal(rootNode.getLeftChild());
            postOrderTraversal(rootNode.getRightChild());
            System.out.print(rootNode.getData() + " ");
        }
    }

    public void inOrderTraversal (Node rootNode) {
        if (rootNode != null) {
            inOrderTraversal(rootNode.getLeftChild());
            System.out.print(rootNode.getData() + " ");
            inOrderTraversal(rootNode.getRightChild());
        }
    }

    public boolean isPresent (Node rootNode, int value) {
        if (rootNode != null) {
            if (value < rootNode.getData()) {
                rootNode = rootNode.getLeftChild();
                return isPresent(rootNode, value);
            }
            else if (value > rootNode.getData()) {
                rootNode = rootNode.getRightChild();
                return isPresent(rootNode, value);
            }
            else 
                return true;
        }
        else
            return false;
    }

    public void deleteNode (Node curr, int value) {
        if (curr != null) {
            Node parent = null;
            while (curr.getData() != value && curr != null) {
                if (value < curr.getData()) {
                    parent = curr;
                    curr = curr.getLeftChild();
                }
                else if (value > curr.getData()) {
                    parent = curr;
                    curr = curr.getRightChild();
                }
            }
            
            if (curr != null) {
                // if v is leaf
                if (curr.getLeftChild() == null && curr.getRightChild() == null) {
                    if (parent != null) {
                        if (parent.getLeftChild() == curr)
                            parent.setLeftChild(null);
                        else if (parent.getRightChild() == curr)
                            parent.setRightChild(null);
                    }
                    else {
                        root = null;
                    }
                }
                // if v has only one child
                else if (curr.getLeftChild() != null ^ curr.getRightChild() != null) {
                    if (curr.getLeftChild() != null) {
                        if (parent != null) {
                            if (parent.getLeftChild() == curr) {
                                parent.setLeftChild(curr.getLeftChild());
                            }
                            else {
                                parent.setRightChild(curr.getLeftChild());
                            }
                        }
                        else {
                            root = root.getLeftChild();
                        }
                    }
                    else {
                        if (parent != null) {
                            if (parent.getLeftChild() == curr) {
                                parent.setLeftChild(curr.getRightChild());
                            }
                            else {
                                parent.setRightChild(curr.getRightChild());
                            }
                        }
                        else {
                            root = root.getRightChild();
                        }
                    }
                }
                // if v has two children
                else {
                    Node successor = curr.getRightChild();
                    while (successor.getLeftChild() != null) {
                        successor = successor.getLeftChild();
                    }
                    deleteNode (curr, successor.getData());
                    if (parent != null) {
                        if (parent.getRightChild() == curr) {
                            parent.setRightChild(successor);
                            successor.setLeftChild(curr.getLeftChild());
                            successor.setRightChild(curr.getRightChild());
                        }
                        else {
                            parent.setLeftChild(successor);
                            successor.setLeftChild(curr.getLeftChild());
                            successor.setRightChild(curr.getRightChild());
                        }
                    }
                    else {
                        successor.setLeftChild(curr.getLeftChild());
                        successor.setRightChild(curr.getRightChild());
                        root = successor;
                    }
                }
            }

            else {
                System.out.println("Element not found.");
            }
        }

        else {
            System.out.println("Underflow.");
        }
    }
}
