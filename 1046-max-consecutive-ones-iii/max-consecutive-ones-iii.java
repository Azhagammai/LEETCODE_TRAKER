class Solution {
    public int longestOnes(int[] arr, int k) {
        int n=arr.length,left=0,right=0,length=0,maximumlength=0,zeroes=0;
        while(right<n){
            if(arr[right]==0){
                zeroes++;
            }
            if(zeroes<=k){
                length=right-left+1;
                maximumlength=Math.max(length,maximumlength);

            }
            if(zeroes>k){
                if(arr[left]==0)zeroes--;
                left++;
            }
            right++;
        }
        return maximumlength;

        
    }
}