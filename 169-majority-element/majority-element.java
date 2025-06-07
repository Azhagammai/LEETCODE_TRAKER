class Solution {
    public int majorityElement(int[] arr) {
        int element=0,count=0;
        //1.Element finding
        for(int i=0;i<arr.length;i++){
            if(count==0){
                element=arr[i];
                count=1;
            }
            else if(arr[i]==element){
                count++;
            }
            else{
                count--;
            }
        }
        count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                count++;
            }
        }
        return (count>arr.length/2)?element:-1;
        
    }
}