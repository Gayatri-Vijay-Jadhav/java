import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int a = sc.nextInt();
        if(a % 2==0){
        System.out.println("a is even number");
        }   
        else{
        System.out.println("a is odd number");
    }
    }
    }