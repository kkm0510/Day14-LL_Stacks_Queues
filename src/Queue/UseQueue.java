package Queue;

import LinkedList.INode;
import LinkedList.MyNode;


public class UseQueue {
    public static void main(String[] args) {
        MyQueue<Integer> queue=new MyQueue<>();
        INode<Integer> node1=new MyNode<>();
        node1.setKey(56);
        INode<Integer> node2=new MyNode<>();
        node2.setKey(30);
        INode<Integer> node3=new MyNode<>();
        node3.setKey(70);

        queue.enqueue(node1);
        queue.enqueue(node2);
        queue.enqueue(node3);

        queue.printQueue();
    }
}

