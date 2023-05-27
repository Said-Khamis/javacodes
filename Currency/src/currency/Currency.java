/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package currency;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gil_t
 */
public class Currency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        
       // int oountData = 6;
        scanner.close();
        
        
        NumberFormat uSformat = NumberFormat.getCurrencyInstance(Locale.US);                
        NumberFormat indformat = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        NumberFormat chinaformat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceformat = NumberFormat.getCurrencyInstance(Locale.FRANCE);


        
        String us = uSformat.format(payment);
        String india = indformat.format(payment);
        String china = chinaformat.format(payment);
        String france = franceformat.format(payment);
        
        System.out.println("Duce");
        System.out.println("US: " + us);
        System.out.println("India: " +  india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        
    }
    
}
