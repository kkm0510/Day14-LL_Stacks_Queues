package LinkedList;

public class UseLinkedList {

    public static void main(String[] args) {
        MyLinkedList<Integer> list=new MyLinkedList<>();
        INode<Integer> node1 = new MyNode<>();
        node1.setKey(56);
        INode<Integer> node2 = new MyNode<>();
        node2.setKey(30);
        INode<Integer> node3 = new MyNode<>();
        node3.setKey(70);
        list.addNode(node3);
        list.addNode(node2);
        list.addNode(node1);
        list.printMyNodes();
    }
}
