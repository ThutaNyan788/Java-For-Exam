package revision3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N ;

        while(true){
            System.out.println("Enter factorial number : ");
            N = sc.nextInt();
            int total = 1;

            for (int i = 1; i <= N; i++) {
                total *= i;
            }

            System.out.println(total);

        }

    }
}
