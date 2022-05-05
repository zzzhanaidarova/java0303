package com.company;
public class Main {

    public static void main(String[] args) {
		BST tree = new BST();
		System.out.println("Binary Search Tree");
		int j=1;
		for (int i=0; i<10; i++){
			tree.put(i, j);
			j++;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(tree.get(i));
		}
		System.out.println("Size: " + tree.size());
		System.out.println("---");
		for (int i=1; i<10; i++){
			if (i%2 == 0){
				tree.delete(i);
			}
		}
		for(int i=0; i<10; i++){
			System.out.println(tree.get(i));
		}
		System.out.println("New size: " + tree.size());
	}
}
