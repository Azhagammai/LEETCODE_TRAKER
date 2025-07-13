class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> list=new ArrayList<>();
  
        for(int i=1;i<=n;i++){
            String str=""; 
            str+=i;
            if(i%3==0&&i%5==0)list.add("FizzBuzz");
            else if(i%3==0)list.add("Fizz");
            else if(i%5==0)list.add("Buzz");
            else list.add(str);
        }
        return list;
        
    }
}