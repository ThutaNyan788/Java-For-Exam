package revision3;

import java.util.Scanner;

//        F1 = 1
//        F2 = 1
//        F3 = F2 + F1 = 1 + 1 = 2
//        F4 = F3 + F2 = 2 + 1 = 3
public class Fabanaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intSize;

        System.out.println("Enter int size : ");
        intSize = sc.nextInt();

        int[] intArr = new int[intSize];

        int f1 = 1;
        int f2 = 1;
        intArr[0] = f1;
        intArr[1] = f2;
//        F3 = F2 + F1 = 1 + 1 = 2

        System.out.println("F1 = 1");
        System.out.println("F2 = 1");
        for (int i = 2; i < intArr.length; i++) {
            intArr[i] = intArr[i-1] + intArr[i-2];
            System.out.println(
                    "F"+(i+1)+" = "+" F"+i+" + "+" F"+(i-1)+" = "+intArr[i-1]+" + "+intArr[i-2]+" = "+(intArr[i-1] + intArr[i-2])
            );
        }
    }
}
