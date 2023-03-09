package Queue;

import LinkedList.INode;
import LinkedList.MyLinkedList;

public class MyQueue<K> {

    MyLinkedList<K> myLinkedList;

    MyQueue() {
        myLinkedList = new MyLinkedList<>();
    }

    public void enqueue(INode<K> node) {
        myLinkedList.appendNode(node);
    }

    public void printQueue() {
        myLinkedList.printMyNodes();
    }
}
