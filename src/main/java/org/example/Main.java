package org.example;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        readFileLines("src/main/resources/test.txt");
        readNumbers("src/main/resources/test2.txt");
    }

    public static void readFileLines(String path) throws FileNotFoundException {
        File file = new File(path);

        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
    public static void readNumbers(String path) throws FileNotFoundException {
        File file = new File(path);

        Scanner scanner = new Scanner(file);

        List<Integer> numbers = new ArrayList<>();

        String[] stringNums = scanner.nextLine().split(" ");

        for (String num : stringNums) {
            numbers.add(Integer.parseInt(num));
        }

        int total = numbers.stream().reduce(0, (a, b) -> a + b);

        System.out.println("Total sum of the numbers: " + total);

        scanner.close();
    }
}