package com.company;

public class MyHashTable<Key, Value> {
    private int M;
    private int size;
    private HashNode<Key, Value>[] chainArray;

    public MyHashTable(){
        this(100);
    }

    public MyHashTable(int M){
        this.M = M;
        chainArray = new HashNode[M];
    }

    private int hash(Key key){
        return (key.hashCode() & 0x7fffffff) % size;
    }

    public void put(Key key, Value value){
    }

    public Value get(Key key){
        int n = hash(key);
        for(HashNode root = chainArray[n]; root != null; root = root.next){
            if (key.equals(root.key))
                return (Value) root.value;
        }
        return null;
    }

    public Value remove(Key key){
        return null;
    }

    public boolean contains(Value value){
        return false;
    }

    public Key getKey(Value value){
        return null;
    }
}