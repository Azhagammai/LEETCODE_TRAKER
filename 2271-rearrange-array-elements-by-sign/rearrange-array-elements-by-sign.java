class Solution {
    public int[] rearrangeArray(int[] arr) {
        int positive_index=0,negative_index=1;
        int n=arr.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans[positive_index]=arr[i];
                positive_index+=2;
            }
            else{
                ans[negative_index]=arr[i];
                negative_index+=2;
            }
        }
        return ans;
    }
}