package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        if (this.name == null) {
            this.name = nameOfNewNode;
        }

        else if (nameOfNewNode.compareTo(this.name) <= 0) {
            try {
                this.left.add(nameOfNewNode);
            } catch (NullPointerException e) {
                this.left = new Node(nameOfNewNode);
            }
        }
        else {
            try {
                this.right.add(nameOfNewNode);
            } catch (NullPointerException e) {
                this.right = new Node(nameOfNewNode);
            }
        }
    }

    public List<String> names() {
        ArrayList<String> nodes = new ArrayList<>();
        return namesHelper(nodes);
    }

    private List<String> namesHelper(List<String> nodes) {

        if (this.left == null) {
            nodes.add(this.name);
        } else { this.left.namesHelper(nodes); }

        if (this.right != null) {
            this.right.namesHelper(nodes);
        }

        return nodes;
    }
}
