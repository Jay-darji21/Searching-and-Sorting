// Find out how many pass requeried to sort the array in descending order using bubble sort


public class Que4 {
    public static void main(String[] args) {
        int arr[] = {3,5,6,1,0};
        int n = arr.length;
        int num = 0;
        for(int i = 0 ; i<n ; i++)
        {
            for(int j = 0; j<n-i-1 ; j++)
            {
                if(arr[j]<arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                num++;
                }
            }
        }
        System.out.println("Number of iteration required are : "+num);
        

    }
}
