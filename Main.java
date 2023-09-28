import GCD.*;
public class Main {
    public static void main(String[] args) {
    int a = 0;
    int b = 0;
    if (args.length > 1) {
       a = Integer.parseInt(args[0]);
       b = Integer.parseInt(args[1]);
    } else System.out.println("Error, Invalid Inputs");    
      System.out.println(gcd.GCD(a, b));
    }
}