import java.util.*;
public class natural {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=Sc.nextInt();
        int sum=0;
        int i=1;
        while (i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("the sum is "+sum);
    

    }
}
