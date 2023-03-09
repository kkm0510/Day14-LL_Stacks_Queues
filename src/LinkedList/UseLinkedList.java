package LinkedList;

public class UseLinkedList {

    public static void main(String[] args) {
        SortedLinkedList<Integer> list = new SortedLinkedList<>();
        INode<Integer> node1 = new MyNode<>();
        node1.setKey(56);
        INode<Integer> node2 = new MyNode<>();
        node2.setKey(30);
        INode<Integer> node3 = new MyNode<>();
        node3.setKey(70);
        INode<Integer> node4 = new MyNode<>();
        node4.setKey(40);
        list.add(node1);
        list.add(node2);
        list.add(node4);
        list.add(node3);
        list.printMyNodes();
        System.out.println(list.getSize());

    }
}
