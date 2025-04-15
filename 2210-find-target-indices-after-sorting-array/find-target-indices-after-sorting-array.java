class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();

        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                list.add(i);
            }
        }
        return list;
        
    }
}