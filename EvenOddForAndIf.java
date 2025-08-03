import java.util.Scanner;
public class EvenOddForAndIf{
public static void main(String [] arg){
Scanner sc = new Scanner(System.in);
System.out.print("Enter n");
int n = sc.nextInt();
for(int i = 2; i<=n; i++){
if(i%2==0) System.out.println(i);
}
}
}
