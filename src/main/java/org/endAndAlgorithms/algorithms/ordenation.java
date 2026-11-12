
package org.endAndAlgorithms.algorithms;

import java.util.Scanner;

public class ordenation {
    public static void execute() {
        System.out.println("Let's explore some, sorting algorithms! Here are a few examples of sorting algorithms in Java:");
        Scanner scanner = new Scanner(System.in);
        // Example 1: Bubble Sort
        System.out.println("Enter the number of elements to sort using Bubble Sort: ");

        int n = Integer.parseInt(scanner.nextLine());

        Long[] bubbleArray = new Long[n];

        for(int i = 0; i < bubbleArray.length; i++){
            System.out.println("Enter element : " + (i+1));
            bubbleArray[i] = Long.parseLong(scanner.nextLine());
        }

        System.out.println("Well, now choose the sorting algorithm you want to use: ");
        System.out.println("1. Bubble Sort");
        System.out.println("0. Exit");
        int choice = Integer.parseInt(scanner.nextLine());

        switch(choice) {
            case 1:
                bubbleSort(bubbleArray);
                break;
            case 2:
                System.out.println("You selected Option 2.");
                break;
            case 0:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

        protected static void bubbleSort(Long[] array) {
        int j = array.length;

        for(int i = array.length; i > 0; i--){
            for(int k = 0; k < j - 1; k++){
                if(array[k] > array[k+1]){
                    Long temp = array[k];
                    array[k] = array[k+1];
                    array[k+1] = temp;
                }
            }
        }

        System.out.println("Sorted array using Bubble Sort: ");
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + (i+1) + ": " + array[i]);
        }
    }
}
