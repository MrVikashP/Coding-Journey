package basic_maths;

import java.util.Scanner;

public class PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printDivisors(num);
    }
    static void printDivisors(int num){
//        for (int i = 1; i <= num ; i++) {
//            if (num % i == 0){
//                System.out.print(i + " ");
//            }
//        }

        for (int i = 1; i <= (int) Math.sqrt(num) ; i++) {
            if (num % i == 0){
                System.out.print(i + " ");
                if (i != num/i){
                    System.out.print(num/i + " ");
                }
            }
        }
    }
}
