package Praktikum.Jobsheet14.Tugas;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("inOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find Node : " + bt.find(5));
        System.out.println("Delete Node 8");
        bt.delete(8);
        System.out.println("");
        System.out.print("PreOrderTraversal : ");
        bt.traversePreOrder(bt.root);
        System.err.println();

        System.out.println("Tambah dengan rekursif");
        bt.addRekursif(6);
        bt.addRekursif(4);
        bt.addRekursif(8);
        bt.addRekursif(3);
        bt.addRekursif(5);
        bt.addRekursif(7);
        bt.addRekursif(9);
        bt.addRekursif(10);
        bt.addRekursif(15);
        
        System.out.print("Tranverse Pre Order : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("Tranverse In Order : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("Tranverse Post Order : ");
        bt.traversePostOrder(bt.root);

        System.out.println("Maks & Min");
        System.out.println("Nilai Makmimum : " + bt.findMax());
        System.out.println("Nilai Minimum  : " + bt.findMin());

        System.out.println("Menampilkan Leaf");
        System.out.print("Leaf : ");
        bt.printLeaf(bt.root);

        System.out.println("\nMenampilkan jumlah leaf");
        System.out.print("Jumlah Leaf : " + bt.jmlLeaf(bt.root));
    }
}