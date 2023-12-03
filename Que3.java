// WAP to sort the array in descending order using insertion sort

import java.util.Arrays;
import java.util.Scanner;

public class Que3 {
    // Function Implementation
    public static void sortedArr(int arr[])
    {
        for(int i = 1 ; i<arr.length ; i++)
        {
            int j = i;
            while (j>0 && arr[j]>arr[j-1]) {
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                j--;
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
