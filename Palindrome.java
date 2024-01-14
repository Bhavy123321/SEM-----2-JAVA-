import java.util.Scanner;
public class Palindrome{
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter an integer: ");
         int n=sc.nextInt();
        int sum=0;
        int temp = n;
        while(n>0)
        {
            int rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("its palindrome number");
        }
        else
        {
            System.out.println("its not palindrome number");
        }
   }
}