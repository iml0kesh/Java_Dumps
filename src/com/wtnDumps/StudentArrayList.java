package com.wtnDumps;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayList {
    static class Student {
        int id;
        String name;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> st = new ArrayList<>();
        int i = 0;
        while(i < 3){
            Student s1 = new Student();
            System.out.println("Enter the id: ");
            s1.id = sc.nextInt();
            System.out.println("Enter Name: ");
            s1.name = sc.next();
            st.add(s1);
            i++;
        }

        for (Student student : st) {
            System.out.println(student.id +" "+ student.name);
        }

    }
}
