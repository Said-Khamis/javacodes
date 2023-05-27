/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secondproject;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author gil_t
 */
public class Secondproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn = new Scanner(System.in);
        int i = 0;
        while(scn.hasNext()){
            String s = scn.nextLine();
             i++;
            System.out.println(i + " " + s); 
        }
    }
    
}
