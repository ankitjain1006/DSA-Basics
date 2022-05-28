package com.datastructure.stack;

public class StackLinkedList {

    StackNode rootNode;

    public void push(String data) {
        StackNode newNode = new StackNode(data);
        if (rootNode == null) {
            rootNode = newNode;
        } else {
            StackNode temp = rootNode;
            rootNode = newNode;
            newNode.setNextNode(temp);
        }
        System.out.println(data + " pushed in to stack");
    }

    public String pop() {
        String data;
        if (rootNode == null) {
            System.out.println("No element present in stack");
            return null;
        } else {
            data = rootNode.getData();
            rootNode = rootNode.getNextNode();
            System.out.println(data + " popped from stack");

        }
        return data;
    }

    public String peek() {

        if (rootNode == null) {
            System.out.println("No element present in stack");
            return null;
        }
        System.out.println("Top element from stack " + rootNode.getData());
        return rootNode.getData();
    }
}
