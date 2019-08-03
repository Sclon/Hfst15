package com.company;

import java.awt.print.PrinterGraphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void downsize(LinkedList<String> employeeNames, int n) {
        ListIterator position = employeeNames.listIterator();
        int i = 0;
        while (i < n) {
            position.next();
            i++;
        }
        position.remove();
    }

    public static void reverse(LinkedList<String> strings) {
        ListIterator fwd = strings.listIterator();
        ListIterator rev = strings.listIterator(strings.size());
        for (int i = 0; i < strings.size()/2; i++) {
            Object next = fwd.next();
            Object prev = rev.previous();
            fwd.set(next);
            rev.set(prev);
        }
        System.out.println(strings);
    }

    public static void stackReverse(String str) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                words[i] = words[i].substring(0,1).toLowerCase() + words[i].substring(1);
            }
            if (words[i].charAt(words[i].length()-1) == '.') {
                words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1, words[i].length()-1);
                stack.push(words[i]);
                break;
            }
            stack.push(words[i]);
        }

        System.out.println(stack);

        for (int i = 0; i < words.length; i++) {
            if (i+1 == words.length) {
                sb.append(stack.pop());
                break;
            }
            sb.append(stack.pop()).append(" ");
        }
        sb.append(".");
        System.out.println(sb.toString());
    }

    public static void breakNumber(Stack s, int n) {
        if (n <= 0) {
            return;
        }
        s.push(n%10);
        System.out.print(s.pop() + " ");
        breakNumber(s,n/10);
    }

    public static Set<String> readText(String file) {
        Set<String> ts = new TreeSet<>();
        try {
            Scanner reader = new Scanner(new File(file));
            reader.useDelimiter("[^a-zA-Z]+");
            while (reader.hasNext()) {
                ts.add(reader.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return ts;
    }

    public static void sieveOfEratosthenes(int n) {
        int root = calculateRoot(n);
        Set<Integer> set = new HashSet<>();
        for (int j = 2; j <= n; j++) {
            set.add(j);
        }
        System.out.println(set);

        int num = 2;
        for (int i = 2; i < root; i++) {
            for (int k = num+num; k <= n; k+=num) {
                set.remove(k);
            }
            num++;
        }

        System.out.println(set);
        System.out.println(set.size());
    }

    private static int calculateRoot(int n) {
        int num1 = 1;
        int num2 = 1;
        int root = 0;
        while (root < n) {
            root = ++num1*++num2;
        }
        return num1;
    }

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();

        Scanner input = new Scanner(System.in);
        String answer = "";
        String name = "";
        String grade = "";

        for (;;) {
            System.out.println("add/remove/modify/print/quit");
            answer = input.nextLine();
            if (answer.equals("quit")){
                break;
            }
            switch (answer) {
                case "add":
                    System.out.println("Student name: ");
                    name = input.nextLine();
                    System.out.println("Grade: ");
                    grade = input.nextLine();
                    map.put(name, grade);
                    break;
                case "remove":
                    System.out.println("Student name: ");
                    name = input.nextLine();
                    map.remove(name);
                    break;
                case "modify":
                    System.out.println("Student name: ");
                    name = input.nextLine();
                    System.out.println("New grade: ");
                    grade = input.nextLine();
                    map.put(name, grade);
                    break;
                case "print":
                    for (String key : map.keySet()) {
                        String n = map.get(key);
                        System.out.println(key + " " + n);
                    }
                    break;
            }
        }

        //sieveOfEratosthenes(87);

        /*
        LinkedList<String> ls = new LinkedList<>();
        ls.push("James");
        ls.push("Pieter");
        ls.push("Emily");
        ls.push("Richard");
        ls.push("Lucy");

        Driveway driveway = new Driveway();
        Street street = new Street(driveway);

        Car c1 = new Car("HT43DF");
        Car c2 = new Car("JI93LS");
        Car c3 = new Car("BM11SS");
        Car c4 = new Car("AA99AS");

        driveway.addCar(c1);
        driveway.addCar(c2);
        driveway.addCar(c3);
        driveway.addCar(c4);

        driveway.removeCar(c1);
         */

        /*
        PriorityQueue tasks = new PriorityQueue();

        Scanner input = new Scanner(System.in);

        String answer = "";
        while (!answer.equals("quit")) {
            System.out.println("What priority does the task have? (1/9)");
            answer = input.nextLine();
            if (answer.equals("quit")) {
                break;
            }
            if (answer.equals("next")) {
                System.out.println(tasks.peek());
                continue;
            }
            int priority = Integer.parseInt(answer);

            System.out.println("Enter a description: ");
            String description = input.nextLine();
            tasks.add(new Task(priority, description));
        }
         */

        /*
        Set<String> treeset = readText("C:\\Users\\flori\\IdeaProjects\\mycodeschool\\txt\\birds.txt");
        System.out.println(treeset);
        System.out.println(treeset.size());
         */


    }
}































