package Praktikum.jobsheet12.practicum1;

/**
 * node
 */
public class node {

    int data;
    node prev, next;
    int jarak;

    node(node prev, int data, int jarak, node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}