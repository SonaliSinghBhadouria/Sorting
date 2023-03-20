package sorting;
import java.util.*;
public class MergeSort {
    public static void conqure(int si ,int mid,  int ei, int array[]){
        int[] merged = new int[ei - si +1];
        int i1 = si;
        int i2= mid+1;
        int x = 0;
        while(i1<=mid && i2<=ei){
            if(array[i1]<=array[i2]){
                merged[x++] = array[i1++];
            }else{
                merged[x++]=array[i2++];
            }
        }
        while(i1<=mid){
            merged[x++] = array[i1++];
        }
        while(i2<=ei){
            merged[x++]=array[i2++];
        }
        
        for (int i=si ;i < merged.length ; i++) {
            array[i]=merged[i];       
        }
    }
    public static void divide(int si , int ei, int array[]) {
        if (si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        divide(si, mid, array);
        divide(mid+1, ei, array);
        conqure(si, mid, ei, array);
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
        divide(0, n-1, array);
        for (int i = 0; i < n ; i++) {
            System.out.print(array[i]+" ");            
        }
        System.out.println();
    }
    
}
