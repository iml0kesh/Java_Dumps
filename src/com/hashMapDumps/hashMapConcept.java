package com.hashMapDumps;

import java.util.*;

public class hashMapConcept {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> h1 = new HashMap<>();
        h1.put(1,1);
        h1.put(2,4);

        System.out.println(h1);

        for(Map.Entry<Integer,Integer> e : h1.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }

}
