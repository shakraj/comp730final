/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp730finals;

/**
 *
 * @author shak
 */
import java.util.Scanner;
public class StringReverse {
      public static void main(String[] args) 
    { 
         Scanner str = new Scanner(System.in);  
    System.out.println("please write something: ");
        String input = str.nextLine(); 
        StringBuilder newinput = new StringBuilder();  
        newinput.append(input); 
        newinput = newinput.reverse(); 
        System.out.println("reverse of you input is: "+newinput); 
    } 
} 
    

