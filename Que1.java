// Wrirte a program to sort the array in descending order using bubble sort

import java.util.*;

public class Que1{

    public static void sortedArr(int arr[])
    {
        int n = arr.length;
        // Implementation of function
        for(int i = 0 ; i<n ; i++)
        {
            for(int j = 0 ; j<n-i-1 ; j++)
            {
                if(arr[j]<arr[j+1])
                {
                    // Swap between arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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