import java.util.*;
public class item {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of pencil:");
        float pencil=sc.nextFloat();
        System.out.println("enter the value of pen:");
        float pen=sc.nextFloat();
        System.out.println("enter the value of eraser:");
        float eraser=sc.nextInt();
        float total=pencil+eraser+pen;
        System.out.println("the bill is:"+total);
        float tax=total+(0.18f*total);
        System.out.println("the bill with 18% tax is:"+tax);
    }
    
}
