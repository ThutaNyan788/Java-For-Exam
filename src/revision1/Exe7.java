package revision1;


import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N (N >= 1): ");
        int N = scanner.nextInt();

        if (N < 1) {
            System.out.println("N must be greater than or equal to 1.");
        } else {
            int[] fibonacci = new int[N];
            fibonacci[0] = 1;
            fibonacci[1] = 1;

            System.out.println("F1 = 1");
            System.out.println("F2 = 1");

            for (int i = 2; i < N; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                System.out.println("F" + (i + 1) + " = F" + i + " + F" + (i - 1) + " = " + fibonacci[i] + " + " + fibonacci[i - 1] + " = " + (fibonacci[i] + fibonacci[i - 1]));
            }
        }

        scanner.close();
    }
}
