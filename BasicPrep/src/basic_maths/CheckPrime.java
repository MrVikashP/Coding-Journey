package basic_maths;

import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/prime-number2314/1
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int res = isPrime(num); // 1 for prime and 0 otherwise.
        System.out.println(res);
    }

    static int isPrime(int N){
        if(N == 1){
            return 0;
        }
        int c = 2;
        while (c * c <= N){
            if (N % c == 0){
                return 0;
            }
            c++;
        }
        return 1;
    }
}
