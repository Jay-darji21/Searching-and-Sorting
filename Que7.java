// Search the element , and find out its last ocurrence.

import java.util.Scanner;

public class Que7 {

    public static int binarySearch(int arr[] ,int target)
    {
        int low = 0,high = arr.length-1,result=-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==target){
                result = mid;
                low = mid+1;
            }
            else if(arr[mid]<target)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements present in array : ");
        int n = sc.nextInt();
        System.out.println("Enter the Array : ");
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the targeted element : ");
        int target = sc.nextInt();
        // Function call
        int result = binarySearch(arr,target);
        System.out.println("Element present at the index : "+result);



        sc.close();
    }
}
