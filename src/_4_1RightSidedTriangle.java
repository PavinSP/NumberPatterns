// *
// * *
// * * *
// * * * *
// * * * * *
import java.util.Scanner;
public class _4_1RightSidedTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++){
                System.out.print("  "); // no of characters in here (in this case: 2)
            }
            for (int k = 1; k <= i; k++){
                System.out.print("* "); // should be the same as in here (in this case: 2)
            }
            System.out.println();
        }
    }
}