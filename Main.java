package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the size of your array");
        int[] anArray = new int[scanner.nextInt()];

        for (int i = 0; i < anArray.length; i++)
        {
            System.out.println("Enter a number");
            anArray[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(anArray));

        reversed(anArray);

        System.out.println(Arrays.toString(anArray));

    }
    private static void reversed(int[] anArray)
    {

        int last = anArray.length-1;
        int mid = anArray.length/2;

        for (int i = 0; i < mid; i ++)
        {
            int temp = anArray[i];
            anArray[i] = anArray[last-i];
            anArray[last-i] = temp;
        }

    }
}
