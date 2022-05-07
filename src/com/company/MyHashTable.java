package com.company;

public class MyHashTable<Key, Value> {
    private int M;
    private int size;
    private HashNode<Key, Value>[] chainArray;

    private int hash(Key key){
        return (key.hashCode() & 0x7fffffff) % size;
    }
}