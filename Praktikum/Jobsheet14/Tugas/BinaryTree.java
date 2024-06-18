package Praktikum.Jobsheet14.Tugas;

public class BinaryTree {
    Node root;
    
    public BinaryTree(){
        root = null;
    }
    
    boolean isEmpty(){ 
        return root == null;
    }
    
    void add(int data){ 
        if (isEmpty()) {
            root = new Node(data);
        } else {
            Node current = root; 
            while(true){
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node (data);
                        break;
                    }
                } else if (data > current.data){
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node (data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }
    
    // Jawaban No 1
    void addRekursif(int data){
        addData(data, root);
    }
    
    void addData(int i, Node a){
        if (root == null) {
            root = new Node(i);
            return;
        } else if (i > a.data){
            if (a.right != null) {
                addData(i, a.right);
            } else {
                a.right = new Node(i);
            }
        } else if (i < a.data){
            if (a.left != null) {
                addData(i, a.left);
            } else {
                a.left = new Node(i);
            }
        }
    }
    
    boolean find(int data){ 
        boolean hasil = false;
        Node current = root;
        while(current != null){ 
            if (current.data == data) {
                hasil = true; 
                break;
            } else if(data < current.data){
                current = current.left; 
            } else {
                current = current.right; 
            }
        }
        return hasil;
    }
    
    void traversePreOrder(Node node){
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    void traversePostOrder(Node node){
        if (node != null) {
            traversePreOrder(node.left);
            traversePreOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node node){
        if (node != null) {
            traversePreOrder(node.left); 
            System.out.print(" " + node.data);
            traversePreOrder(node.right);
        }
    }
    
    Node getSuccessor(Node del){
        Node successor = del.right;
        Node successorParent = del;
        while(successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    
   void delete(int data){
        if (!isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Couldn't find data ");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current==root) {
                    root=current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }

    //Jawaban no 2
    public int findMax(){
        return nilaiMaks(this.root);
    }
    
    int nilaiMaks(Node node){ 
        if (node.right != null) {
            return nilaiMaks(node.right);
        }
        return node.data;
    }
    
    public int findMin(){
        return nilaiMin(this.root);
    }
    
    int nilaiMin(Node node){ 
        if (node.left != null) { 
            return nilaiMin(node.left);
        }
        return node.data;
    }

    //Jawaban no 3
    public void printLeaf(Node node){
        if(node == null){
            return;
        } 
        if(node.left == null && node.right == null){
            System.out.print(" " + node.data);
        }
        printLeaf(node.left);
        printLeaf(node.right);
    }
    //Jawaban no 4
    int jmlLeaf(Node node){
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        } else {
            return jmlLeaf(node.left) + jmlLeaf(node.right); 
        }
    }

}