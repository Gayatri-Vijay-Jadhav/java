import java.util.Scanner;
public class Arithmatic{
public static void main(String[] arg){
Scanner sc=new Scanner(System.in);
int a, b;
System.out.println("Enter value of a: ");
a = sc.nextInt();
System.out.println("Enter value of b: ");
b = sc.nextInt(); 

System.out.print("value of a: "+a);
System.out.print("value of b: "+b);
System.out.println("Addition of two numbers:"+(a+b));
System.out.println("Subtraction of two numbers:"+(a-b));
System.out.println("Multiplication of two numbers:"+(a*b));
System.out.println("Division of two numbers:"+(a/b));
System.out.println("Modulus of two numbers:"+(a%b));
}
}