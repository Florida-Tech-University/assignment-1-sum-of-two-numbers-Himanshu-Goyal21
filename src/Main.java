import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read two integers
        System.out.print("Enter Your First Number");
         int a1 = scanner.nextInt();
        System.out.print("Enter Your Second Number");
         int a2 = scanner.nextInt();
        //  Print their sum  using println
        int sum = a1 + a2 ;
        System.out.print(+ sum);
        scanner.close();
    }
}
