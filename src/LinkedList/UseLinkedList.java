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
        list.appendNode(node1);
        list.appendNode(node3);
        list.insertBetween(node2, node1, node3);
        System.out.println(list.searchNode(30));
        list.printMyNodes();
    }
}
