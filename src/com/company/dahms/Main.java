package com.company.dahms;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();


        while (true){

            menu();
            int userChoice = input.nextInt();

	        switch (userChoice){
                case 1:
                    System.out.println("Please describe the task.");
                    String a = input.next();
                    addTask(tasks,a);
                    break;
                case 2:
                    System.out.println("Enter the number of the task you would like to delete");
                    listTask(tasks);
                    int i = input.nextInt();
                    deleteTask(tasks,i);
                    break;
                case 3:
                    listTask(tasks);
                    System.out.println("Please enter the number of the task you would like to update");
                    i = input.nextInt();
                    System.out.println("Please enter the new task description");
                    a = input.next();
                    updateTask(tasks,i,a);
                    break;
                case 4:
                    listTask(tasks);
                    break;
                case 0: System.exit(0);
            }
        }

    }

    public static void menu(){
        System.out.println("Please choose an option:");
        System.out.println("(1) Add a task.");
        System.out.println("(2) Remove a task.");
        System.out.println("(3) Update a task.");
        System.out.println("(4) List all tasks.");
        System.out.println("(0) Exit.");
    }

    public static void addTask(ArrayList tasks, String desc){
        tasks.add(desc);
    }

    public static void deleteTask(ArrayList tasks, int index){
        tasks.remove(index-1);
    }

    public static void listTask(ArrayList tasks){
       for (int i =0; i < tasks.size(); i++){
           System.out.println(i + ": " + tasks.get(i));
       }
    }

    public static void updateTask(ArrayList tasks, int index, String desc){
        tasks.set(index-1, desc);
    }

}
