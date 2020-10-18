package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        String abc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Fill the array. Press E when you are over");
        do {
            abc = sc.nextLine();
            if (!abc.toUpperCase().equals("E"))
                arrayList.add(Integer.valueOf(abc));
        } while (!abc.toUpperCase().equals("E"));

        int[] arr = new int[arrayList.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrayList.get(i);
        }

        System.out.print(Arrays.toString(arr) + "-->" + Arrays.toString(sortTheOdd(arr)));
    }

    public static int[] sortTheOdd(int arr[]) {
        int temp;
        boolean notSorted;

        do {
            notSorted = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 1) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] % 2 == 1) {
                            if (arr[i] > arr[j]) {
                                notSorted = true;
                                temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                                break;
                            }
                        }
                    }
                }
            }
        } while (notSorted);
        return arr;
    }
}

