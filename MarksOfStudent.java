import java.util.Scanner;
public class MarksOfStudent{
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter 1st Subject Marks: ");
         int a=sc.nextInt();
         System.out.println("Enter 2nd Subject Marks: ");
         int b=sc.nextInt();
         System.out.println("Enter 3rd Subject Marks: ");
         int c=sc.nextInt();
         System.out.println("Enter 4th Subject Marks: ");
         int d=sc.nextInt();
         System.out.println("Enter 5th Subject Marks: ");
         int e=sc.nextInt();
         double avg=(a+b+c+d+e)/5; 
         if(avg >= 60)
         {
            System.out.println("first division");
         }
         else if(avg >= 50)
         {
            System.out.println("second division");
         }
         else if(avg >= 40)
         {
            System.out.println("third division");
         }
         else
         {
            System.out.println("FAIL!!!!!");
         }
   }
}