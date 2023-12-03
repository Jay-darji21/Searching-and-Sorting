/*  Given a sorted integer array containing duplicates, count occurrences of a given number. If the element 
is not found in the array, report that as well.*/

import java.util.Scanner;

public class Que9 {

    // Find the first occurence

    public static int firstOccurence(int arr[],int target)
    {
        int low = 0, high = arr.length-1,Firt_occurence=-1;
            // First occurence of element
            while(low<=high){
                int mid=low+(high-low)/2;
                if(arr[mid]==target){
                    Firt_occurence = mid;
                    high = mid-1;
                }
                else if(arr[mid]<target)
                {
                    low = mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        return Firt_occurence;
    }

    // Last Occurence
    
    public static int lastOccurence(int arr[] ,int target){
        int low = 0, high = arr.length-1,Last_occurence=-1;
            // First occurence of element
            while(low<=high){
                int mid=low+(high-low)/2;
                if(arr[mid]==target){
                    Last_occurence = mid;
                    low = mid+1;
                }
                else if(arr[mid]<target)
                {
                    low = mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        return Last_occurence;
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
        

        System.out.println("Enter the targeted element : " );
        int target = sc.nextInt();

        // Function Calling

        int lastOcu = lastOccurence(arr,target);
        int firstOcu = firstOccurence(arr,target);

        // Calculation of number of elements in an array
        int result = lastOcu-firstOcu+1;
        if(firstOcu==-1 && lastOcu==-1){
            System.out.println("Targeted element not found");
        }
        else{
        System.out.println("Target "+target+" occurs for "+result+" time");
        }
    }
}
