class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n=arr.length;

        int element_1=0,element_2=0,count_1=0,count_2=0;
       
        ArrayList<Integer> list=new ArrayList<>();
        int minimum=(int)(n/3)+1;
        for(int i=0;i<n;i++){
            if(count_1==0&&element_2!=arr[i]){
                count_1++;
                element_1=arr[i];
            }
            else if(count_2==0&&element_1!=arr[i])
            {
                count_2++;
                element_2=arr[i];
            }
            else if(arr[i]==element_1)count_1++;
            else if(arr[i]==element_2)count_2++;
            else {
                count_1--;
                count_2--;
            }
        }
        count_1=0;
        count_2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==element_1)count_1++;
            if(arr[i]==element_2)count_2++;
        }
        if(count_1>=minimum)list.add(element_1);
        if(count_2>=minimum&&element_1 != element_2)list.add(element_2);
        return list;

        
    }
}