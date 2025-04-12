
class Solution {
    public int longestConsecutive(int[] arr) {
        int n=arr.length;
        if(n==0)return 0;
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        int longest=1;
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int a:set){
            if(!set.contains(a-1)){
                count=1;
                int x=a;
                while(set.contains(x+1)){
                    x=x+1;
                    count++;

                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}