package basic_maths;

import java.util.Arrays;
import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/lcm-and-gcd4516/1
// a2z DSA sheet
public class HCF_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long A = sc.nextLong();
        Long B = sc.nextLong();
        Long[] res = lcmAndGcd(A,B);
        System.out.println(Arrays.toString(res));

    }
    static Long[] lcmAndGcd(Long A , Long B){
        Long lcm = findLcm(A,B);
        Long gcd = findGcd(A,B);

        return new Long[]{lcm,gcd};
    }

    static Long findLcm(Long A , Long B){
        // HCF * LCM = Product of two numbers
        return (A*B)/findGcd(A,B);
    }

    static Long findGcd(Long A , Long B){
        if (B == 0){
            return A;
        }
        return findGcd(B,A%B);
    }
}
