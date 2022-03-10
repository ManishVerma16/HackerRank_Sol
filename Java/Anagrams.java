package Java;

import java.util.Arrays;
import java.util.Scanner;

class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        char[] ch1 = s1.toLowerCase().toCharArray();
        char[] ch2 = s2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
        }
        System.out.println(Arrays.equals(ch1, ch2)?"Anagram":"Not Anagram");
    }
}
