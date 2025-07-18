import java.util.Scanner;
public class DivisibleBy5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        if(num%5==0){
            System.err.println("Number is Divisible by 5  ");
        }
        else{
            System.err.println("Number is not Divisible by 5  ");
        }
        }
        }