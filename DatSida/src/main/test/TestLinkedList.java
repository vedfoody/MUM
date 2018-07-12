package main.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

    class Node {

        Object data;
        Node pointer;


        public Node (Object data, Node pointer) {
            this.data = data;
            this.pointer = pointer;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getPointer() {
            return pointer;
        }

        public void setPointer(Node pointer) {
            this.pointer = pointer;
        }
    }

    public class ThuyDoanList implements Iterator<Node> {
        Node head;
        Node current;
        Node tail;

        ThuyDoanList(Node head) {
            this.head = head;
            this.current = head;
        }

        public Node goToFirst() {
            this.current = head;
            return this.current;
        }

        public Node goToLast() {
            if (tail == null) {
                while (hasNext()) {
                    next();
                }
                tail = current;
            }
            return this.tail;
        }

        @Override
        public String toString() {
            goToFirst();

            StringBuilder resultBuilder = new StringBuilder( );
            while (hasNext()) {
                resultBuilder.append( next().getData() );
            }

            return resultBuilder.toString();
        }

        @Override
        public Node next() {
            this.current = current.getPointer();
            return current;
        }

        public void add(Object data) {
            goToLast().setPointer( new Node( data, null ) );
        }

        public boolean find(Object data) {
            goToFirst();

            while (hasNext()) {
                if (this.next().getData().equals( data )) {
                    return true;
                }
            }

            return false;
        }

        @Override
        public boolean hasNext() {
            return this.current.getPointer() != null;
        }
    }
}
