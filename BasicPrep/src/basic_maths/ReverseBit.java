package basic_maths;

import java.util.Collections;
import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/reverse-bits3556/1
// a2z DSA sheet
public class ReverseBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long num = sc.nextLong();

        Long res = reversedBits(num);
        System.out.println(res);
    }
    static Long reversedBits(Long num){
        // first convert into bits, then reverse it and then convert into decimal and return.
        // convert into binary string
        String bs = Long.toBinaryString(num);

        // Since has to include zeroes too so if the binary form is not covering total bits then have to
        // add zeroes including the original one so that can fulfil the criteria of the question.
        String bsWith0 = String.join("", Collections.nCopies(32- bs.length(), "0")) + bs;
        // can use directly "0".repeat(32 - bs.length()) + bs - in java 11 or more.

        //reversing binary String
        String rbs = new StringBuilder(bsWith0).reverse().toString();

        // getting the decimal form of the reversed binary string and then returning.

        Long ds = Long.parseLong(rbs,2);

        return ds;

    }
}
