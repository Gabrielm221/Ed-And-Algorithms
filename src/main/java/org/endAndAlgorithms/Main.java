package org.endAndAlgorithms;
import org.endAndAlgorithms.algorithms.ordenation;
import org.endAndAlgorithms.trees.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello Everyone!");

        Scanner scanner = new Scanner(System.in);

        int option;

        do{
            System.out.println("Enter a number for the options: ");
            System.out.println("1. Basic Algorithms");
            System.out.println("2. Advanced Algorithms");
            System.out.println("0. Exit");
            option = scanner.nextInt();

            switch(option){
                case 1 :
                    System.out.println("You selected basic algorithms - Option 1.");
                    System.out.println("1 - BubbleSort");
                    System.out.println("2 - BinarySearchTree");
                    System.out.println("0 - Exit");
                    int subOption = scanner.nextInt();
                    switch (subOption) {
                        case 1:
                            System.out.println("You selected BubbleSort.");
                            ordenation.execute();
                            break;
                        case 2:
                            System.out.println("You selected BinarySearchTree.");
                            binarySearchTree.execute();

                            break;
                        case 0:
                            System.out.println("Exiting the program. Thank you for using it!");
                            break;
                        default:
                            System.out.println("Invalid option. Please try again.");
                            break;
                    }


                    break;

                case 2 :
                    System.out.println("You selected Option 2.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;

                case 0 :
                    System.out.println("Exiting the program. Thank you for using it!");
                    break;
            }
        }while (option != 0);
    }
}