import java.util.Scanner;
public class MathFunction{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int  a = sc.nextInt();
        System.out.print("Enter a Second number: ");
        int b =sc.nextInt();
        System.out.println(Math.pow(a,b));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
        System.out.println(Math.abs(a));
        System.out.println(Math.abs(b));
        System.out.println(Math.ceil(4.3));
        System.out.println(Math.floor(4.3));
        System.out.println(Math.round(4.3));
        System.out.println(Math.random());
        System.out.println(Math.log(a));
        System.out.println(Math.log10(a));
        System.out.println(Math.sin(a));
        System.out.println(Math.cos(a));
        System.out.println(Math.tan(a));
        System.out.println(Math.toDegrees(a));
        System.out.println(Math.toRadians(a));
        System.out.println(Math.cbrt(a));
        System.out.println(Math.expm1(a));
        System.out.println(Math.getExponent(a));
        System.out.println(Math.ulp(a));
        System.out.println(Math.rint(a));
        System.out.println(Math.sinh(a));

        
    }
}
// output:
//  Enter a first number: 2
// Enter a Second number: 3
// 8.0
// 1.4142135623730951 
// 3
// 2
// 2
// 3
// 5.0
// 4.0
// 4
// 0.6767868562566075 
// 0.6931471805599453 
// 0.3010299956639812 
// 0.9092974268256817 
// -0.4161468365471424
// -2.185039863261519 
// 114.59155902616465 
// 0.03490658503988659
// 1.2599210498948732
// 6.38905609893065  
// 1
// 2.3841858E-7      
// 2.0
// 3.626860407847019 
