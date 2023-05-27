/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gil_t
 */
public class FileHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        createFile();
        
        writeToFile();
        
        readFromFile();
        
        readEachCharacter();
    }
    
    public static void createFile(){
        File file = new File("F://java_files/first_file.txt");
        try {
            if(file.createNewFile()){
                System.out.println("File Created:: " + file.getName());   
            }else{
                System.out.println("File Exists");
            }
        } catch (IOException ex) {
            Logger.getLogger(FileHandling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void getFileInfo(){
           File file = new File("F://java_files/first_file.txt");
           if (file.exists()) {
               System.out.println("File Name:: " + file.getName());  
               System.out.println("File Path:: " + file.getAbsolutePath());  
               System.out.println("File Writable:: " + file.canExecute());  
               System.out.println("File Readble:: " + file.canWrite());  
                System.out.println("File Readble:: " + file.canRead());  
        }
    }
    
    public static void writeToFile(){
        try {
            FileWriter fileWriter = new FileWriter("F://java_files/first_file.txt");
            fileWriter.write("This is my first File Writting::".toUpperCase());
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(FileHandling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void readFromFile(){
        File file = new File("F://java_files/first_file.txt");
        try {
            Scanner s = new Scanner(file);
            while (s.hasNextLine()) {
                String next = s.nextLine();
                System.out.println(next);
            }
            s.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileHandling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void readEachCharacter() {
             File file = new File("F://java_files/first_file.txt");
        try {
            Scanner s = new Scanner(file);
            while (s.hasNextLine()) {
                String next = s.nextLine();
                List<String> stringList = Arrays.asList(next.split(""));
                for (int i = 0; i < stringList.size(); i++) {
                    System.out.println( stringList.get(i));
                }
            }
            s.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileHandling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
