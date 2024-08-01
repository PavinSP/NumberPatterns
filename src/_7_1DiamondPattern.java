//          *
//        * * *
//      * * * * *
//    * * * * * * *
//  * * * * * * * * *
//    * * * * * * *
//      * * * * *
//        * * *
//          *

import java.util.Scanner;
public class _7_1DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = i; j <= n; j++){
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            for (int m = 1; m < i; m++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            for (int k = i; k <= n; k++){
                System.out.print("* ");
            }
            for (int m = i; m < n; m++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}