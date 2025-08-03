import java.util.Scanner;
public class EvenOddFor{
public static void main(String [] arg){
Scanner sc = new Scanner(System.in);
System.out.print("Enter n");
int n = sc.nextInt();
for(int i = 2; i<=n; i=i+2){
System.out.println(i);
}
}
}
