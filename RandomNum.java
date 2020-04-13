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
import java.util.Random;

public class RandomNum {
    public static void main(String[] args)
    {
        Random nums = new Random();
    int randnums;
    int sum=0;
for(int i=0; i<10; i++)
    {
      randnums = nums.nextInt(11);
    System.out.print(" " + randnums);
      sum = sum + randnums ;
    }

System.out.println(sum);
    }
}