package LinkedList;

public class MyLinkedList<K> {

    public INode<K> head;
    public INode<K> tail;
    private int size;

    public int getSize() {
        return size;
    }

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
        size++;
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
        if(size==0){
            return null;
        }
        size--;
        INode<K> deletedNode = head;
        head = (head.getNext());
        deletedNode.setNext(null);
        return deletedNode;
    }

    public INode<K> popLast() {
        if(size==0){
            return null;
        }
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
        INode<K> tempNode = head;
        while (tempNode!=null && tempNode.getNext() != node) {
            tempNode = tempNode.getNext();
        }
        if(tempNode==null) return;
        tempNode.setNext(tempNode.getNext().getNext());
        size--;
    }


    public void printMyNodes() {
        System.out.println("My Nodes : " + head);
    }
}
