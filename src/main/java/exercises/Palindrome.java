package exercises;

import java.util.Scanner;

public class Palindrome {

    public static void main (String[] args) {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        int length;
        System.out.println("Enter the number or String");
        original = in.nextLine();
        length = original.length();
        for (int i =length -1; i>=0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("reverse is:" +reverse);

        if(original.equals(reverse))
            System.out.println("The number or string is palindrome");
        else
            System.out.println("The number or string is not a palindrome");

    }
}
