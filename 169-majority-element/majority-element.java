class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length,count1=0,element=0;
        for(int i=0;i<n;i++){
            if(count1==0){
                count1=1;
                element=arr[i];
            }
            else if(element==arr[i]){
                    count1++;    
            }
            else{
                count1--;
            }
        }        
        int count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==element){
                count2++;
            }
        }
        if(count2>n/2)return element;
        return -1;
    }
}