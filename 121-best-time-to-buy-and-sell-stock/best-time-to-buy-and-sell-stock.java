class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int minvalue=Integer.MAX_VALUE,maxvalue=0;
        for(int i=0;i<n;i++){
            minvalue=arr[i]<minvalue?arr[i]:minvalue;
            maxvalue=maxvalue>arr[i]-minvalue?maxvalue:arr[i]-minvalue;
        }
        return maxvalue;
        
    }
}