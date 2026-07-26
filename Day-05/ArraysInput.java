import java.util.Scanner;

public class ArraysInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int numbers[] = new int[size];

        // Take input for array elements
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Print array elements
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

        sc.close();
    }
}
