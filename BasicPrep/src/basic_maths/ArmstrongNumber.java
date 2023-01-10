package basic_maths;

import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1
// a2z DSA sheet
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = isArmstrongNumber(n);
        System.out.println(res);

    }
    static String isArmstrongNumber(int n){
        int num = findSumOfCubesOFDigits(n);
        if (num == n)
            return "Yes";
        else
            return "No";
    }

    static int findSumOfCubesOFDigits(int n){
        int sum = 0;
        while (n > 0){
            int d = n % 10;
            sum += d * d * d;
            n /= 10;
        }
        return sum;
    }
}
