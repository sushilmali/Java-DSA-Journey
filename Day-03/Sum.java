import java.util.Scanner;  // ✅ Import added

public class Sum {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // create scanner
        int a = scanner.nextInt();                 // read first integer
        int b = scanner.nextInt();                 // read second integer
        int sum = calculateSum(a, b);              // call method
        System.out.println(sum);                   // print result
        scanner.close();                           // ✅ good practice
    }
}
