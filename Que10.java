// Check if the entered number is perfect square or not , if yes then return true else return false

import java.util.Scanner;

public class Que10 {
    public static boolean perfectSquare(int num){
        int low = 0 ,high = num;
        while (low<=high) {
            int mid = low+(high-low)/2;
            if(mid*mid==num){
                return true;
            }
            else if(mid*mid<num){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        // Function Calling
        boolean result = perfectSquare(num);
        System.out.println(result);

        sc.close();
    }
}
