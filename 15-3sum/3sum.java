class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> list=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
                        if(i>0&&arr[i]==arr[i-1])continue;

            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==0){
                    list.add(Arrays.asList(arr[i],arr[left],arr[right]));
                          while(left<right&&arr[left+1]==arr[left])left++;
                          while(left<right&&arr[right]==arr[right-1])right--;
                    left++;
                    right--;
              
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return list;
    }
}