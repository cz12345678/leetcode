package com.cczz.learn.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 1000);
            System.out.print(arr[i] + "\t");
        }

        System.out.println();
        quickSort(arr, 0, arr.length -1);

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }


    }

    public static void quickSort(int[] arr, int low, int high){
        if (low >= high){
            return;
        }

        int key = arr[low];
        int index = low;

        for (int i = low; i < arr.length; i++){
            if (key > arr[i]){
                index++;

                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[index];
        arr[index] = temp;

        quickSort(arr, low, index);
        quickSort(arr, index + 1, high);

    }

}
