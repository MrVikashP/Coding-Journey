package basic_maths;

import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/palindrome0746/1
// a2z DSA sheet
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String res = is_palindrome(num);
        System.out.println(res);
    }

    static String is_palindrome(int num) {
        // converting integer to string so that comparing can be easy.
        String n = Integer.toString(num);
        // assign value to start and end.
        int start = 0, end = n.length()-1;

        // check from both the sides since it satisfies the below condition
        while (start <= end){
            // if at any place both are not equal just return No.
            if (n.charAt(start) != n.charAt(end)){
                return "No";
            }
            start++;
            end--;
        }
        // since it passes the condition then number must be palindrome.
        return "Yes";
    }
}
