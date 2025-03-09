class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] ch=s.toCharArray();
        int hash[]=new int[256];
        int n=s.length();
        int right=0,left=0,maxlength=0;
        for(int i=0;i<n;i++) {
            hash[ch[i]]=-1;
        }
        while(right<n){
            if(hash[ch[right]]!=-1){
                if(hash[ch[right]]>=left){
                    left=hash[ch[right]]+1;

                }
            }
            int length=right-left+1;
            maxlength=Math.max(maxlength,length);
            hash[ch[right]]=right;
            right++;

        }
        return maxlength;
    }
}