package com.company;

import sun.awt.SunHints;
import java.security.Key;
import java.util.prefs.NodeChangeEvent;

public class BST<Key extends Comparable<Key>, Value>{
    private MyNode root;
    private class MyNode{
        private MyNode left, right;
        private int n;
        private Key key;
        private Value val;

        public MyNode(Key key, Value val, int n){
            this.key = key;
            this.val = val;
            this.n = n;
            left = right = null;
        }
    }

    public int size(){
        return size(root);
    }

    private int size(MyNode root){
        if (root == null) return 0;
        else return root.n;
    }

    public Value get(Key key){
        return get(root, key);
    }

    private Value get(MyNode root, Key key){
        if (root == null) return null;
        int compare = key.compareTo(root.key);
        if (compare < 0) return get(root.left, key);
        else if (compare > 0) return get(root.right, key);
        else return root.val;
    }

    public void put(Key key, Value val){
        root = put(root, key, val);
    }

    private MyNode put(MyNode root, Key key, Value val){
        if (root == null) return new MyNode(key, val, 1);
        int compare = key.compareTo(root.key);
        if (compare < 0) root.left = put(root.left, key, val);
        else if (compare > 0) root.right = put(root.right, key, val);
        else root.val = val;
        root.n = size(root.left) + size(root.right) + 1;
        return root;
    }

    public void delete(Key key){
        root = delete(root, key);
    }

    private MyNode delete(MyNode root, Key key){
        if (root == null) return null;
        int compare = key.compareTo(root.key);
        if (compare < 0) root.left = delete(root.left, key);
        else if (compare > 0) root.right = delete(root.right, key);
        else {
            if (root.right == null) return root.left;
            if (root.left == null) return root.right;
        }
        root.n = size(root.left) + size(root.right) + 1;
        return root;
    }
}
