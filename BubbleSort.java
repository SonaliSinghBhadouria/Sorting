package sorting;
import java.util.*;
public class BubbleSort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                }
            }
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
       
        printArray(arr);
        
    }
    
}
