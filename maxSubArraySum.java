class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long total=Long.MIN_VALUE;
        long sum=0l;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum>total){
                total=sum;
            }
            if(sum<0){
                sum=0l;
            }
        }
        return total;
    }
    
}
