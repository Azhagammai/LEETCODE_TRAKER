class Solution {
    public int maxSubArray(int[] arr) {
        long sum=0;
        int n=arr.length;
        long maximum=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>maximum)maximum=sum;
            if(sum<0)sum=0;

        }
        return (int)maximum;

        
    }
}