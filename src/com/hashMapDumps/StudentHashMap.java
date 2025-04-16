package com.hashMapDumps;

import java.util.HashMap;
import java.util.Scanner;

public class StudentHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> Students = new HashMap<>();


        while(true) {
            System.out.println("MENU");
            System.out.println(
                    "1.Enter New Student \n" +
                    "2.Display All Students \n" +
                    "3.Update Student Name \n" +
                    "4.Remove Student \n" +
                    "5.Exit \n" +
                    "Enter Your Choice: "
            );

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter The Name of Student");
                    String name = sc.next();
                    System.out.println("Enter the Roll no. of Student");
                    int roll = sc.nextInt();
                    Students.putIfAbsent(roll,name);
                    break;
                case 2:
                    System.out.println("All Students");
                    Students.forEach((rollNo, stuName) ->
                            System.out.println("Roll no. " + rollNo + "Student Name "+ stuName)
                    );
                    break;
                case 3:
                    System.out.println("Enter Student Roll no.");
                    int rollToSearch = sc.nextInt();


            }
        }
    }
}
