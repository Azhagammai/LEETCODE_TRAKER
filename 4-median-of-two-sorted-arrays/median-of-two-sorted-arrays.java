class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:arr1){
            list.add(num);
        }
        for(int n:arr2){
            list.add(n);
        }
        Collections.sort(list);
        int l=list.size();
        if(l%2==1)return list.get(l/2);
        else return (list.get(l/2-1)+list.get(l/2))/2.00;

        
    }
}