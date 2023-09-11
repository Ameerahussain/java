import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ente the number");
        int num;
        int fact=1;
        num=sc.nextInt();
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("the factorial is:"+ fact);

    }
    
}
