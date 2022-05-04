package com.company;

public class Main {

    public static void main(String[] args) {
		BST tree = new BST();
		System.out.println("Binary Search Tree");
		int j=10;
		for (int i=0; i<10; i++){
			tree.put(i, j);
			j+=10;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(tree.get(i));
		}
		System.out.println("Size: " + tree.size());
	}
}
