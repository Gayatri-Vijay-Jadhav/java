import java.util.Scanner;
public class Prime{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();
        boolean flag = false; //false means prime number
        for(int i = 2; i<n; i++){
           if(n % i == 0){  //i is factor of n
            flag = true ; //true means composite
            break;
        }
    }
        if(flag==false){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("composite number");
        }
        }
    }
