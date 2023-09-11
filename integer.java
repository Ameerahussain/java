import java.util.*;
public class integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        int choice;
        int evensum=0;
        int oddsum=0;
        do{
            System.out.print("enter the number");
            number=sc.nextInt();
            if(number%2==0){
                evensum+=number;
            }else{
                oddsum+=number;
            }
            System.out.print("do you want to continue?press 1 for yes and  0 for no ");
            choice=sc.nextInt();
        }
        while(choice==1);
      System.out.println("the sum of even numbers"+evensum);
      System.out.println("the sum of odd numbers"+oddsum);
    }
    }
