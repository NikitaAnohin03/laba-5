package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
            int n = 20;
            int[] array = randomArray(n, -99, 99);
            System.out.println("Given an array: " + Arrays.toString(array));
            array = bubbleSort(array, false);
            System.out.println("Sort result in ascending order: " + Arrays.toString(array));
        }

        public static int[] randomArray(int n, int min, int max) {
            int[] array = n > 0 ? new int[n] : new int[0];
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    array[i] = (int) (Math.random() * (Math.abs(max - min) + 1)) + min;
                }
            }
            return array;
        }

        public static int[] bubbleSort(int[] array, boolean reverse) {
            if (array != null && array.length > 1) {
                for (int i = 0; i < array.length - 1; i++) {
                    for (int j = i + 1; j < array.length; j++) {
                        if ((reverse && array[j] > array[i]) || (!reverse && array[j] < array[i])) {
                            int temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
            }
            return array;
        }
    }
