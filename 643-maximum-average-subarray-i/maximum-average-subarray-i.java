class Solution {
    public double findMaxAverage(int[] arr, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        double avg=sum/k;
        double maxi=avg;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i]-arr[i-k];
          
            maxi=Math.max(maxi,sum/k);
        }
        return maxi;

        
    }
}