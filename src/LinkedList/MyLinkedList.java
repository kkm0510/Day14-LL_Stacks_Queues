package LinkedList;

public class MyLinkedList<K> {

    public INode<K> head;
    public INode<K> tail;

    public void addNode(INode<K> newNode) {
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

    public void appendNode(INode<K> newNode) {
        if (this.tail == null)
            this.tail = newNode;
        if (this.head == null)
            this.head = newNode;
        else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insertBetween(INode<K> newNode, INode<K> leftNode, INode<K> rightNode) {
        INode<K> tempNode = head;
        while (tempNode != leftNode) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(newNode);
        newNode.setNext(rightNode);
    }

    public INode<K> pop() {
        INode<K> deletedNode = head;
        head = (head.getNext());
        deletedNode.setNext(null);
        return deletedNode;
    }

    public INode<K> popLast() {
        INode<K> deletedNode = tail;
        INode<K> tempNode = head;
        while (tempNode.getNext() != tail)
            tempNode = (tempNode.getNext());
        tail = tempNode;
        tail.setNext(null);
        return deletedNode;
    }

    public INode<K> searchNode(K key){
        INode<K> tempNode = head;
        while (tempNode.getKey() != key)
            tempNode = (tempNode.getNext());
        return tempNode;
    }


    public void printMyNodes() {
        System.out.println("My Nodes : " + head);
    }
}
