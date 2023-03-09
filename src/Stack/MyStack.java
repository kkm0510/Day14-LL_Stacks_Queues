package Stack;

import LinkedList.INode;
import LinkedList.MyLinkedList;

public class MyStack<K> {
    MyLinkedList<K> myLinkedList;

    MyStack(){
        myLinkedList=new MyLinkedList<>();
    }

    public void push(INode<K> node1) {
        myLinkedList.addNode(node1);
    }

    public void printStack() {
        myLinkedList.printMyNodes();
    }

    public INode<K> peak() {
        return myLinkedList.head;
    }

    public INode<K> pop() {
        return myLinkedList.pop();
    }
}
