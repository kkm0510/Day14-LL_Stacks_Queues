package LinkedList;

public class SortedLinkedList<K extends Comparable<K>> {

    public INode<K> head;
    public INode<K> tail;
    private int size;

    public int getSize() {
        return size;
    }

    private void addFirst(INode<K> newNode) {
        if (this.tail == null)
            this.tail = newNode;
        if (this.head == null)
            this.head = newNode;
        else {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void add(INode<K> newNode) {
        if (this.tail == null)
            this.tail = newNode;
        if (this.head == null)
            this.head = newNode;
        else if(head.getNext()==null && head.getKey().compareTo(newNode.getKey())>0){
            addFirst(newNode);
        }
        else {
            INode<K> tempNode = head;
            while (tempNode.getNext()!=null && tempNode.getNext().getKey().compareTo(newNode.getKey()) < 0) {
                tempNode = tempNode.getNext();
            }
            newNode.setNext(tempNode.getNext());
            tempNode.setNext(newNode);
        }
        size++;
    }

    public void insertBetween(INode<K> newNode, INode<K> leftNode, INode<K> rightNode) {
        INode<K> tempNode = head;
        while (tempNode != leftNode) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(newNode);
        newNode.setNext(rightNode);
        size++;
    }

    public INode<K> pop() {
        size--;
        INode<K> deletedNode = head;
        head = (head.getNext());
        deletedNode.setNext(null);
        return deletedNode;
    }

    public INode<K> popLast() {
        size--;
        INode<K> deletedNode = tail;
        INode<K> tempNode = head;
        while (tempNode.getNext() != tail)
            tempNode = (tempNode.getNext());
        tail = tempNode;
        tail.setNext(null);
        return deletedNode;
    }

    public INode<K> searchNode(K key) {
        INode<K> tempNode = head;
        while (tempNode.getKey() != key)
            tempNode = (tempNode.getNext());
        return tempNode;
    }

    public void insertAfter(INode<K> newNode, INode<K> leftNode) {
        INode<K> tempNode = head;
        while (tempNode != leftNode) {
            tempNode = tempNode.getNext();
        }
        newNode.setNext(tempNode.getNext());
        tempNode.setNext(newNode);
        size++;
    }

    public void delete(INode<K> node) {
        size--;
        INode<K> tempNode = head;
        while (tempNode.getNext() != node) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(tempNode.getNext().getNext());
    }


    public void printMyNodes() {
        System.out.println("My Nodes : " + head);
    }
}
