import java.util.Scanner;
public class LeapYear{
public static void main(String[] arg){
Scanner sc = new Scanner(System.in);
System.err.print("Enter a Year");
int Year = sc.nextInt();
if(Year % 4==0){
    System.err.print(Year+"  Year is Leap Year");
    }
else{
    System.err.print(Year+"  Year is not leap Year");
}

}

}
