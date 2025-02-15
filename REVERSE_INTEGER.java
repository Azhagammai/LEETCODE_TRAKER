import java.util.Scanner;
public class REVERSE_INTEGER{
    public static int isReverse(int n){
        int rem;
        int rev=0;
        boolean neg=false;
        if(n<0){
            neg=true;
            n=n*(-1);
        }
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;

        }
        return neg?rev*(-1):rev;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        System.out.println(isReverse(number));
    }
}