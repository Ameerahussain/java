import java.util.*;
public class fever {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the temperature of the body:");
        double temp=sc.nextDouble();
        if(temp>99){
            System.out.println("you have fever");
        }else{
            System.out.println("you dont have fever");
        }

    }
    
}
