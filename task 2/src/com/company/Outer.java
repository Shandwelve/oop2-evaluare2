package com.company;

import java.util.stream.IntStream;

/**
 * Outer class contains a storage for data
 */
class Outer {
    /**
     * List of numbers
     */
    private final int[] storage;

    /**
     * Instance of inner class
     */
    private final Inner inner;

    /**
     * Outer Constructor
     * @param storage Array of number
     */
    public Outer(int[] storage) {
        this.inner = new Inner();
        this.storage = storage;
    }

    /**
     * Method displays in consoles results of operations with arrays
     */
    public void print() {
        System.out.println("Min: " + inner.getMin());
        System.out.println("Max: " + inner.getMax());
        System.out.println("Avg: " + inner.getAverage());
        System.out.println("Even sum: " + inner.getEvenSum());
    }

    /**
     * Inner class for operations with array
     */
    class Inner {
        /**
         * @return Maximal element in outer class array
         */
        private int getMax() {
            return IntStream
                    .of(storage)
                    .max()
                    .getAsInt();
        }

        /**
         * @return Maximal element in outer class array
         */
        public int getMax(int[] list) {
            return IntStream
                    .of(list)
                    .max()
                    .getAsInt();
        }

        /**
         * @return Minimal element in outer class array
         */
        private int getMin() {
            return IntStream
                    .of(storage)
                    .min()
                    .getAsInt();
        }

        /**
         * @return Minimal element given array
         */
        public int getMin(int[] list) {
            return IntStream
                    .of(list)
                    .min()
                    .getAsInt();
        }

        /**
         * @return Average of elements in outer class array
         */
        private double getAverage() {
            return IntStream
                    .of(storage)
                    .average()
                    .getAsDouble();
        }

        /**
         * @return Average of elements from given array
         */
        public double getAverage(int[] list) {
            return IntStream
                    .of(list)
                    .average()
                    .getAsDouble();
        }

        /**
         * @return Average of elements in outer class array
         */
        private int getEvenSum() {
            return IntStream
                    .of(storage)
                    .reduce(0, (accumulator, item) -> item % 2 == 0 ? accumulator + item : accumulator);
        }

        /**
         * @return Average of elements in outer class array
         */
        public int getEvenSum(int[] list) {
            return IntStream
                    .of(list)
                    .reduce(0, (accumulator, item) -> item % 2 == 0 ? accumulator + item : accumulator);
        }
    }
}