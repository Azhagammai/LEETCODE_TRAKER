class Solution {
    public int maxScore(int[] arr, int k) {
       int leftsum=0,rightsum=0,maxsum=0;
       for(int i=0;i<k;i++){
        leftsum+=arr[i];
        }
        maxsum=leftsum;
        int rightindex=arr.length-1;
        for(int i=k-1;i>=0;i--){
            leftsum-=arr[i];
            rightsum+=arr[rightindex];
            rightindex--;
            maxsum=Math.max(maxsum,(leftsum+rightsum));
        }
        return maxsum;
        
    }
}