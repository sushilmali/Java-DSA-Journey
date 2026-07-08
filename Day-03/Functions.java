import java.util.Scanner;

public class Functions {
    public static void printMyName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printMyName(input);
        scanner.close();
    }
}
