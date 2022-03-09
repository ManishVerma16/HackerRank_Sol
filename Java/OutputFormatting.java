package Java;

import java.util.Scanner;

class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // sc.close();
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
        System.out.printf("%-15s%03d\n",s1, x);
        }
        System.out.println("================================");
    }
}

/*
        System.out.println(String.format("%d", 101));
        System.out.println(String.format("|%10d|", 101));
        System.out.println(String.format("|%-10d|", 101));
        System.out.println(String.format("|% d|", 101));
        System.out.println(String.format("|%10d|", 101));
        System.out.println(String.format("|%f|", 101.01));
        System.out.println(String.format("|%x|", 101));
        System.out.println(String.format("|%c|", 'z'));
*/