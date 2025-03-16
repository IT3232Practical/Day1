import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        reverse(n);
    }
        public static void reverse(int n) {
            int mid = n / 2;
            for (int i = mid; i >= 1; i--) {
                System.out.print(i + " ");
            }
            for (int i = n; i > mid; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
    
    }
}
