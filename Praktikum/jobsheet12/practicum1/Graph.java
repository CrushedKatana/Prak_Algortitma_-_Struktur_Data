package Praktikum.jobsheet12.practicum1;

/**
 * Graph
 */
public class Graph {

    int vertex;
    DoubleLinkedList list[];

    public Graph(int v) {
        vertex = v;
        list = new DoubleLinkedList[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak){
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            if (list[i].get(j) == asal) {
                ++totalIn;
            }
        }
    }
}