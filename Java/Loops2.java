package Java;

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a,b,n,temp = 0, s;
        for (int i = 0; i < t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            s = 0;
            for (int j = 0; j <n; j++) {
                s = (int) (Math.pow(2, j) * b) + s;
                System.out.printf("%d ",s+a);
            }
            System.out.println();
        }
    }
}
