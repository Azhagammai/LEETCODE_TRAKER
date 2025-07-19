class Solution {
    public boolean canJump(int[] arr) {

        int jump=0;
        for(int num:arr){
            if(jump<0)return false;
            if(num>jump)jump=num;
            jump--;
        }
        return true;
    }
}