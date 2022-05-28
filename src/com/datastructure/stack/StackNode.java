package com.datastructure.stack;

public class StackNode {
    public StackNode(String data) {
        this.data = data;
    }

    private String data;
    private StackNode nextNode;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public StackNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(StackNode nextNode) {
        this.nextNode = nextNode;
    }


}
