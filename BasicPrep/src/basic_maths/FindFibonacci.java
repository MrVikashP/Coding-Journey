package basic_maths;

import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/nth-fibonacci-number1335/1
public class FindFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long res = nthFibonacci(n);
        System.out.println(res);
    }
    static long nthFibonacci(long n) {
        if (n == 1){
            return 0;
        }
        if (n == 2){
            return 1;
        }

        long a = 0, b = 1;
        long result = 0;
        for (int i = 2; i <= n; i++) {
            result = (a + b) % 1000000007;

            a = b;
            b = result;
        }
        return result;
    }
}
