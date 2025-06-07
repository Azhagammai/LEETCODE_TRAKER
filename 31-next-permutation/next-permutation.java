class Solution {
    public void nextPermutation(int[] arr) {
        int index=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1)reverse(arr,0,arr.length-1);
        else{
            for(int i=arr.length-1;i>index;i--){
                if(arr[index]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[index];
                    arr[index]=temp;
                    break;
                }
            }
             reverse(arr,index+1,arr.length-1);
        }
       
        
    }
    private static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}