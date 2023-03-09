package Stack;

import LinkedList.INode;
import LinkedList.MyNode;

public class UseStack {

    public static void main(String[] args) {
        MyStack<Integer> stack=new MyStack<>();
        INode<Integer> node1=new MyNode<>();
        node1.setKey(56);
        INode<Integer> node2=new MyNode<>();
        node2.setKey(30);
        INode<Integer> node3=new MyNode<>();
        node3.setKey(70);

        stack.push(node3);
        stack.push(node2);
        stack.push(node1);

        stack.printStack();
        System.out.println(stack.peak().getKey());
        System.out.println(stack.pop());
        stack.printStack();
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());
    }
}
