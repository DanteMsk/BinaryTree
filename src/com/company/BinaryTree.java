package com.company;

import java.util.*;

public class BinaryTree {
    private Tree root;

    public void lRun() {
        lRun(root);
    }

    public void wRun() {
        wRun(root);
    }

    private void lRun(Tree x) {
        if (x == null) return;
        lRun(x.rightChild);
        System.out.print(" || " + x.value + "   ");
        lRun(x.leftChild);
    }


    private void wRun(Tree _tree) {
        if (_tree == null) return;
        ArrayDeque<Tree> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(_tree);
        while (!arrayDeque.isEmpty()) {
            Tree current = arrayDeque.pop();
            if (current.rightChild != null) arrayDeque.push(current.rightChild);
            if (current.leftChild != null) arrayDeque.push(current.leftChild);
            System.out.print("  " + current.value + "    ");
        }
    }

    public void add(String _value) {
        if (root == null) {
            root = new Tree();
            root.value = _value;
            return;
        }
        Tree current = root;
        while (true) {
            int cmp = current.value.compareTo(_value);
            if (cmp < 0) {
                Tree next = current.leftChild;
                if (next == null) {
                    current.leftChild = new Tree();
                    current.leftChild.value = _value;
                    return;
                }
                current = next;
            } else if (cmp == 0) {
                return;
            } else {
                Tree next = current.rightChild;
                if (next == null) {
                    current.rightChild = new Tree();
                    current.rightChild.value = _value;
                    return;
                }
                current = next;
            }
        }
    }
}
