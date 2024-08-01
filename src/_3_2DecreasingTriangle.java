import java.util.Scanner;
public class _3_2DecreasingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = i; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}