/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mergesort;

/**
 *
 * @author gil_t
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        mergeSort(arr);
        
        System.out.println("Array after sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void mergeSort(int[] arr)
    {
        if (arr.length < 2) {
            return; // Base case: if the array has 0 or 1 element, it is already sorted
         }
          
          //Divide array into two halves
          int mid = arr.length / 2;
          int[] left = new int[mid];
          int[] right = new int[arr.length - mid];
          
          System.arraycopy(  arr,   0, 
                  left,0, 
                 mid);
          
          System.arraycopy(      arr,mid,
                  right,0, 
                  arr.length - mid);
          
         // Recursively sort the two halves
         mergeSort(left);
         mergeSort(right);
        
         // Merge the sorted halves
         merge(arr, left, right);
    }
    
     private static void merge(int[] arr, int[] left, int[] right) 
     {
        int i = 0; // Index for the left array
        int j = 0; // Index for the right array
        int k = 0; // Index for the merged array

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
         }

        // Copy the remaining elements of left[] if any
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy the remaining elements of right[] if any
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}
