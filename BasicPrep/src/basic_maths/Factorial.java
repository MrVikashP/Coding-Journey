package basic_maths;

import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/factorial5739/1
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long res = factorial(num);
        System.out.println(res);

    }
    static long factorial(int N){
        if (N == 0 || N == 1){
            return 1;
        }
        long result = 2;
        for (int i = 3; i <= N ; i++) {
            result *= i;
        }

        return result;
    }
}
