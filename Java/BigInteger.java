package Java;
  
import java.util.*;  
public class BigInteger {    
    public static void main(String args[]){    
        Scanner sc = new Scanner(System.in);
        java.math.BigInteger a = sc.nextBigInteger();    
        java.math.BigInteger b = sc.nextBigInteger();
        sc.close();
        java.math.BigInteger res1 = a.add(b);
        java.math.BigInteger res2 = a.multiply(b);
        System.out.println(res1 + "\n" + res2);  
      }    
}  
