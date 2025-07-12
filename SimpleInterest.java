public class SimpleInterest{
    public static void main (String[] arg){
        int p = 1000; //Principal
        int r = 6; //Rate
        double t =  5 ; //Time
        double SI = (p * r * t) / 100; //Simple interest=Principal*Rate*time/100
        System.out.println("Simple Interest: " + SI);
    }
}