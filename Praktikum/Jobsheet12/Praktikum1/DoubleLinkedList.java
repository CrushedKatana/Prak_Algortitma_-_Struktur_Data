package Praktikum.Jobsheet12;

import Praktikum.Jobsheet12.Praktikum1.node;

/**
 * DoubleLinkedList
 */
public class DoubleLinkedList {

    public class DoubleLinkedList30 {
    node head;
    int size;

    public DoubleLinkedList30(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int size(){
        return size;
    }

    public void addFirst(int item, int jarak){
        if (isEmpty()) {
            head = new node(null, item, jarak, null);
        } else {
            node newNode = new node(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int getJarak(int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai Index Di luar batas");
        }   
        node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public void remove(int index) {
        node current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                } 
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
        size--;
    }

    public int get (int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Linked List Kosong");
        }
        node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void clear(){
        head = null;
        size = 0;
    }

}
}