
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gil_t
 */
public class jMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Duce");
        
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int result = 0;
        
        for(int i=0;i<t;i++){
            
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int p = 0; p < n; p++){                
                result =  ( a + (int) Math.pow(2, p)  * b ) + result;
                System.out.print( result + " ");
            }
             System.out.println("");
            result = 0;
        }
        in.close();
    }
    
}
