package com.liushang.structure;

import java.util.Iterator;

//手写链表
public class MyLinkedList implements Iterable {

    @Override
    public Iterator iterator() {
        return new Iterator() {

            Node node = firstNode;

            @Override
            public boolean hasNext() {
                return node!=null;
            }

            @Override
            public Object next() {
                int val = node.val;
                node = node.next;
                return val;
            }
        };
    }

    private static class Node {

        private int val;

        private Node next;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }
    }

    private Node firstNode;

    private Node currentNode;

    public void add(int value) {
        Node node = new Node(value);
        if (firstNode == null) {
            firstNode = node;
            currentNode = node;
        } else {
            currentNode.next = node;
            currentNode = node;
        }
    }

    public void display() {
        Node node = firstNode;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        for (Object o : myLinkedList) {
            System.out.println(o);
        }
        myLinkedList.display();
    }

}
