// Using Bit-manipulation check the given number is odd or even 

import java.util.*;
import java.io.*;

public class Que11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        if((num&1)==1){
            System.out.println("Number is odd");
        }
        else{
            System.out.println("Number is even");
        }
    }
}
