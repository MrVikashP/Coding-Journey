package basic_maths;

import java.util.Scanner;

// https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int res = reverse(x);
        System.out.println(res);
    }

    static int reverse(int x){
        long reversed = 0;
        while(x != 0){
            reversed = reversed * 10 + (x % 10);
            x /= 10;
        }

        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE){
            return 0;
        }
        return (int) reversed;
    }
}
