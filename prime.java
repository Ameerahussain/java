import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
            }

        }
        if(isPrime==true){
            System.out.println("n is a prime number");
        }else{
            System.out.println("n is not a prime number");
        }
         
    }
    
}
