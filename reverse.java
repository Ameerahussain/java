import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number To Be Reversed");
        int n;int lastdigit;
        n=sc.nextInt();
        while(n>0){
            lastdigit=n%10;
            System.out.print(lastdigit+" ");
        n=n/10;

        }
        System.out.println();
        
    }
    
}
