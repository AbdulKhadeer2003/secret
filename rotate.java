class Compute {
    
    public void rotate(int arr[], int n)
    {
        /*
        //1.method
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        */
        //2 method -reverse array and again reverse based on no of rotaion
        reverse(arr,0,n-1);
        reverse(arr,1,n-1);
        
    }
    public void reverse(int arr[], int start, int end){
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