class Solution {
    public int maxSubArray(int[] arr) {
        int currentsum=arr[0];
        int maximum=arr[0];
        for(int i=1;i<arr.length;i++){
            currentsum=Math.max(arr[i],currentsum+arr[i]);
            maximum=Math.max(maximum,currentsum);
        }
        return maximum;
        
    }
}