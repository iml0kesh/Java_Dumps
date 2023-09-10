package com.sahaj;

import java.util.Scanner;

public class Main {

    public static boolean comboCheck(String[] spells, String spell){
        if (spell.isEmpty()) {
            return true;
        }

        for (String s : spells) {
            if (spell.startsWith(s)) {
                String remainingSpell = spell.substring(s.length());
                if (comboCheck(spells, remainingSpell)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String Winner(String spells[], String spell){
        if(comboCheck(spells,spell)){
                return "Harry";
        }
        return "Voldemort";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] spells = new String[n];
        for(int i=0; i<n; i++){
            spells[i] = sc.next();
        }
//        for(String s : spells){
//            System.out.println(s);
//        }
        String spell = sc.next();
//        System.out.println(spell);

        System.out.println(Winner(spells,spell));

    }
}
