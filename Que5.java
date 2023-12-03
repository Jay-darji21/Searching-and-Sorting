// Find out the number of iteration required to sort the array in descending order using selection sort 


public class Que5 {
    public static void main(String[] args) {
        int arr[] = {3,5,1,6,0};
        int n = arr.length;
        int num = 0;

        for(int i = 0 ; i<n ; i++)
        {
            for(int j = 0 ; j<n ; j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    num++;
                }
            }
        }
        System.out.println("Number of iterations : "+num);
        
    }
}
