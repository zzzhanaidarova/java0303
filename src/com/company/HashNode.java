package com.company;

import javax.xml.soap.Node;

public class HashNode<Key, Value> {
    private HashNode head;
    private Key key;
    private Value value;
    private HashNode next;
    public HashNode(Key key, Value value, HashNode next){
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public Value get(Key key){
        for (HashNode root = head; root != null; root = root.next)
            if(key.equals(root.key)) return (Value) root.value;
        return null;
    }

    public void put(Key key, Value value){
        for (HashNode root = head; root != null; root = root.next)
            if (key.equals(root.key)){
                root.value = value;
                return;
            }
        head = new HashNode(key, value, head);
    }

    @Override
    public String toString(){
        return "{" + key + " " + value + "}";
    }


}