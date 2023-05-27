/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duplicatearrayindex;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author gil_t
 */
public class DuplicateArrayIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        removeDuplicatedIndexArrays();
    }
    
    public static void removeDuplicatedIndexArrays(){
        System.out.println("Duce:");
        int[] arr = {10,13,50,12,13,45,13};
       
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer integer : arr) {
           hashSet.add(integer);
        }
        System.out.println(hashSet);
        //System.out.println(arr.toString());
    }
    
}
