package com.company;


import java.util.Scanner;

class Main {
    /**
     * Entry point
     */
    public static void main(String[] args) {
        int[] storage = Main.generateData();
        Outer outer = new Outer(storage);
        Outer.Inner inner = outer.new Inner();

        // Display operations result from outer class
        outer.print();

        // Display operations result from inner class
        System.out.println(inner.getMin(storage));
        System.out.println(inner.getMax(storage));
        System.out.println(inner.getAverage(storage));
        System.out.println(inner.getEvenSum(storage));
    }

    /**
     * @return Array of data entered from the keyboard
     */
    private static int[] generateData() {
        Scanner scanner = new Scanner(System.in);

        // Receives from the user the number of items
        System.out.println("Introduce array length: ");
        int listLength = scanner.nextInt();
        int[] numbers = new int[listLength];

        // Async receive numbers from user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the " + (i + 1) + " number: ");
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }
}


