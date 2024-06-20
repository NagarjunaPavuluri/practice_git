public class ReverseIntegerLeetcode {
    public static void main(String args[]) {
        int n=12345;
        int rem=0;
        double temp=0;
        while(n!=0){
            temp=temp*10+n%10;
            n=n/10;
        }
        if(temp<Integer.MAX_VALUE && temp>Integer.MIN_VALUE){
            System.out.println((int)temp);
        }else{
            System.out.println("0");
        }

    }
}
