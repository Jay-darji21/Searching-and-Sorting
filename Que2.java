// WAP the program to Sort the Array in descending order using Selection Sort

import java.util.Arrays;
import java.util.Scanner;

public class Que2 {

    public static void sortedArr(int arr[])
    {
        int n = arr.length;
    
        // Implementation of function
        for(int i = 0; i<n ; i++)
        {
            
            for(int j = i ; j<n ; j++)
            {
                if(arr[i] < arr[j])
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements present in array : ");
        int num = sc.nextInt();

        // User input for Array
        int arr[] = new int[num];
        System.out.println("Enter the Array : ");
        for(int i = 0 ; i<num ; i++)
        {
            arr[i]=sc.nextInt();
        }

        // Function calling
        sortedArr(arr);

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}


