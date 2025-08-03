import java.util.Scanner;
public class TableOf19{
public static void main(String [] arg){
Scanner sc = new Scanner(System.in);
System.out.print("Enter n");
int n = sc.nextInt();
for(int i = 1; i<=n; i++){
if(i%19==0) System.out.println(i);
}
}
}
