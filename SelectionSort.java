package sorting;

import java.util.*;

public class SelectionSort {
    public static void Sort (int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int s = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[s] > arr[j]){
                    s=j;
                }
            }
            int a = arr[s];
            arr[s]= arr[i];
            arr[i]= a;
        }
         System.out.println("the sorted array is:");    
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_size;
        System.out.println("enter you array size:");
        arr_size = sc.nextInt();
        int[] arr = new int [arr_size];
        System.out.println("enter the elements of array:");
        for (int i =0; i < arr_size; i++){
            arr[i] = sc.nextInt();
        } 
        System.out.println("your array is:");
        for (int i =0; i < arr_size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Sort(arr);
    }
    
}
