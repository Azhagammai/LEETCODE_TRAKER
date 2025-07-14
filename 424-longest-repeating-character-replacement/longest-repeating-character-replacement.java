class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,maxi=0,ans=0;
        int occur[]=new int[26];
        int index=0;
        for(int right=0;right<s.length();right++){
            index=s.charAt(right)-'A';
            occur[index]++;
            if(occur[index]>maxi){
                maxi=occur[index];
            }
            if((right-left+1)-maxi>k){
                occur[s.charAt(left)-'A']--;
                left++;
            }
            int windowsize = right-left+1;
            if(windowsize>ans){
                ans=windowsize;
            }
        }
        return ans;
        
    }
}