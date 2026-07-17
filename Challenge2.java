public class Challenge2 {

    static void calculate(int[] arr)
    {
        int avg = 0;
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < 5; i++)
        {
            sum = sum + arr[i];
            maxi = Math.max(maxi, arr[i]);
            mini = Math.min(mini, arr[i]);
        }
        avg = sum/arr.length;
        System.out.println("Maximum is : " + maxi);
        System.out.println("Average is : " + avg);
        System.out.println("Minimum is : " + mini);
        System.out.println("Sum is : " + sum);
    }
    public static void main(String[] args) {
        int[] arr =  {3,4,2,5,8};
        calculate(arr);
        
    }
    
    

}
