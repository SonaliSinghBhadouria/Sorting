package sorting;
import java.util.*;
public class QuickSort {
    public static int partition(int l , int h , int[] array) {
        int p = array[h];
        int i =l-1;
        for (int j = l; j < h; j++) {
            if(array[j]<p){
                i++;
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
        i++;
        int t = array[i];
        array[i] = p;
        array[h] = t;
        return i;
    }
    public static void quicksort(int l , int h , int[] array) {
        if(l<h){
            int pivot = partition(l, h, array);
            quicksort(l, pivot-1, array);
            quicksort(pivot+1, h, array);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array :");
        int n = sc.nextInt();
        System.out.println("Enter Elements of array :");
        int[]array = new int[n];
        for (int i =0; i < n; i++){
            array[i] = sc.nextInt();
        } 
        quicksort(0, n-1, array);
        for (int i = 0; i < n ; i++) {
            System.out.print(array[i]+" ");            
        }
        System.out.println();
    }
    
}
