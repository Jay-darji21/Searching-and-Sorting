// Find out the numbers of 1's present in sorted binary Array.

import java.util.Scanner;

public class Que8 {
    public static int binarySearch(int arr[])
    {
        int low = 0, high = arr.length-1,num=0;
        int result = 0;
        
            while(low<=high){
                int mid=low+(high-low)/2;
                if(arr[mid]==1){
                    result = mid;
                    high = mid-1;
                }
                else if(arr[mid]<1)
                {
                    low = mid+1;
                }
                
            }

            // Number of 1's in an array
            num = arr.length-result;
            return num;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of elements present in an Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array : ");
        for(int i = 0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        // Function Calling
        int result = binarySearch(arr);
        System.out.println("Number of 1's present in Array : "+result);
    }
}
