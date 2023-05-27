/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesorting;

/**
 *
 * @author gil_t
 */
public class BubbleSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = {10,20,30,60,10,5};
        //System.out.println(numbers[0]);
        int temp = 0;
        for(int i = 0; i < numbers.length; i++){
         
            for(int j = 0; j < numbers.length - 1; j++){
               
                if(numbers[j] > numbers[j + 1]){
                     temp = numbers[j];
                     numbers[j] = numbers[j + 1];
                     numbers[j + 1] = temp;
                }
             
            }
        }
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");
    }
    
}
