package basic_maths;

import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1
// a2z DSA sheet
public class DivisorsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Long res = sumOfDivisors(num);
        System.out.println(res);
    }
    static Long sumOfDivisors(int N){
        Long ans = 0L;

        for (int i = 1; i <= N ; i++) {
            // will check that how many times a number can be a divisor and (number*totalTimes)
            int totalTimes = N / i;
            ans += i*totalTimes;
        }
        return ans;
    }
}
