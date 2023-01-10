package basic_maths;

import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/count-digits5716/1
// a2z DSA sheet
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = evenlyDivides(N);
        System.out.println(res);
    }

    static int evenlyDivides(int N){
        // start the count with 0, then check for each digit that evenly divides the number.
        int count = 0, num = N;
        while (num > 0){
            int digit = num % 10; // extracting each digit
            // since digit can't be 0 because it will throw runtime error when the number divides by it.
            if (digit != 0 && N % digit == 0) // counter check whether number is completely divisible by digits.
                count++; // increase the count when fulfills the above condition.
            num /= 10;
        }
        return count; // return the count.
    }
}
