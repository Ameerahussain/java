import java.util.*;
public class multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        for(int i=0;i<=10;i++)
        {
            num=num*i;
        }
        System.out.println("the multiplication table is"+ num);
    }
    
}
