class Solution {
    public int[] sortedSquares(int[] arr) {
        int n=arr.length;
        int left=0,right=n-1;
        int ans[]=new int[n];
        
        for(int i=n-1;i>=0;i--){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[i]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[i]=arr[right]*arr[right];
                right--;
            }
        }

        
        
        return ans;
        
    }
}