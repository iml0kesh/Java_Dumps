package com.collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;

// Array List
public class JavaCollectionFramework {
    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<String> list1 = new ArrayList<>();

        // Methods

        // 1.Adding elements to arraylist.
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Mango");
        System.out.println("fruits List after adding: "+ list1);

        // 2.Getting element by index.
        String lastFruit = list1.get(2);
        System.out.println("Last Fruit: "+lastFruit);

        // 3.Updating an element.
        list1.set(2,"Grape"); // Mango updated to Grape.
        System.out.println("After Updating The fruits: "+ list1);

        // 4.Remove element by index.
        list1.remove(2); // Removes grape.
        System.out.println("List after removing by Index: " + list1);

        // 5.Remove element by value.
        list1.remove("Banana"); // Removes Banana.
        System.out.println("List after removing by object: " + list1);

        // 6.check if the Element exists.
        boolean hasApple = list1.contains("Apple");
        System.out.println("List contains Apple: " + hasApple);

        // 7.get the size of arraylist.
        int size = list1.size();
        System.out.println("Size of List: " + size);

        // 8.Iterate through ArrayList.
        for(String fruit: list1) {
            System.out.println(fruit);
        }

        // 9.Clear Arraylist.
        list1.clear();

        // 10. Check if ArrayList is empty.
        boolean isEmpty = list1.isEmpty();
        System.out.println("Is list empty? " + isEmpty);
    }
}

class LinkedListFrameWork {
    public static void main(String[] args) {
        // Creating a LinkedList.
        LinkedList<String> fruitsLinkList = new LinkedList<>();

        // Adding elements.
        fruitsLinkList.add("Mango");
        fruitsLinkList.add("Apple");
        fruitsLinkList.add("Banana");
        fruitsLinkList.add("Grape");
    }
}
