package LinkedList;

public class UseLinkedList {

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        INode<Integer> node1 = new MyNode<>();
        node1.setKey(56);
        INode<Integer> node2 = new MyNode<>();
        node2.setKey(30);
        INode<Integer> node3 = new MyNode<>();
        node3.setKey(70);
        INode<Integer> node4 = new MyNode<>();
        node4.setKey(40);
        list.appendNode(node1);
        list.appendNode(node2);
        list.appendNode(node3);
        list.insertAfter(node4, node2);
        list.printMyNodes();
    }
}
