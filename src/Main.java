/*
Question : You have been given a text message. You have to return the Run-length Encoding of the given message.
           Run-length encoding is a fast and simple method of encoding strings. The basic idea is to represent repeated
            successive characters as the character and a single count. For example, the string "aaaabbbccdaa" would be
             encoded as "a4b3c2d1a2"
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stringLength = 1;
        System.out.println("Enter all the words together :");
        String words = input.nextLine();
        for (int start = 0; start < words.length() - 1; start++) {
            if (words.charAt(start) == words.charAt(start + 1)) {
                stringLength++;
            } else {
                System.out.print(words.charAt(start));
                System.out.print(stringLength);
                stringLength = 1;
            }
        }
        System.out.print(words.charAt(words.length() - 1));
        System.out.print(stringLength);
    }
}
