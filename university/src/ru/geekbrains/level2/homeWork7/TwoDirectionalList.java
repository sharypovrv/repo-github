package ru.geekbrains.level2.homeWork7;

public class TwoDirectionalList implements DirectionalList {

    private Node first;

    @Override
    public void add(String val) {
        if (first == null) {
            first = new Node(val, null, null);
            return;
        }

        add(val, first);
    }

    private void add(String val, Node current) {
        if (current.getNext() == null) {
            current.setNext(new Node(val, current, null));
        } else {
            add(val, current.getNext());
        }
    }

    @Override
    public boolean remove(String val) {

        if (first.getVal().equals(val)) {
            if (first.getNext() == null) {
                first = null;
            } else {
                first = first.getNext();
            }
            return true;
        }

        Node current = first.getNext();
        Node prevOfCurrent = first;

        while (current != null) {
            if (current.getVal().equals(val)) {
                if (current.getNext() != null) {
                    current.getNext().setPrev(prevOfCurrent);
                }
                prevOfCurrent.setNext(current.getNext());
                return true;
            } else {
                prevOfCurrent = current;
                current = current.getNext();
            }
        }

        return false;
    }

    @Override
    public Object getFirst() {
        return first;
    }

    @Override
    public int size() {
        if (first == null) {
            return 0;
        }

        int size = 1;
        Node current = first;

        while (current.getNext() != null) {
            size++;
            current = current.getNext();
        }

        return size;
    }

    @Override
    public void printList() {
        if (first == null) {
            System.out.print("");
            return;
        }

        Node current = first;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.getNext();
        }
        System.out.println();

    }

    public class Node {
        private String val;
        private Node prev;
        private Node next;

        public Node(String val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }

        public String getVal() {
            return val;
        }

        public Node getPrev() {
            return prev;
        }

        public Node getNext() {
            return next;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
