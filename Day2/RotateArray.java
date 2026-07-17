package Day2;

public class RotateArray {
 
    public static void rotateArray(int[] arr, int k)
    {
        k = k % arr.length;
        reverseFun(arr, 0, arr.length - 1);
        reverseFun(arr, 0 , k-1);
        reverseFun(arr, k, arr.length - 1);
    }

    
    public static void reverseFun(int [] arr, int start, int end)
    {
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,3,7,5};
        int k = 3;
        rotateArray(arr, k);
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
    }
}
    