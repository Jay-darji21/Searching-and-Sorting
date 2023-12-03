// Linear Search

import java.util.Scanner;

public class Que6 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements present in array : ");
        int num = sc.nextInt();
        
        // User input for Array
        System.out.println("Enter the Array : ");
        int arr[] = new int[num];
        for(int i=0 ; i<num ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the targeted element : ");
        int target = sc.nextInt();

        int flag = 0;
        int idx = 0;
        // Linear Search
        for(int i = 0 ; i<num ; i++)
        {
            if(arr[i]==target)
            {
                idx=i;
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("Element not found in an Array");
        }
        else{
            System.out.println("Targeted element is present at the index number : "+idx);
        }

        sc.close();
   } 
}
