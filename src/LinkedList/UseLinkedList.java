package LinkedList;

public class UseLinkedList {

    public static void main(String[] args) {
        INode<Integer> node1 = new MyNode<>();
        node1.setKey(56);
        INode<Integer> node2 = new MyNode<>();
        node2.setKey(30);
        node1.setNext(node2);
        INode<Integer> node3 = new MyNode<>();
        node3.setKey(70);
        node2.setNext(node2);
        System.out.println(node1.getKey() + " -> " + node2.getKey() + " -> " + node3.getKey());
    }
}
