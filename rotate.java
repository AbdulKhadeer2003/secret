class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        d=d%n;
        reverse(arr,0,n-1);
        //if right rotation
        
        //reverse(arr,0,d-1);
        //reverse(arr,d,n-1);
        
        //if  left rotation
        int d1=n-d;
        reverse(arr,0,d1-1);
        reverse(arr,d1,n-1);
    }
    public static void reverse(int arr[], int start, int end){
            int temp;
            while (start < end) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
    }
}
