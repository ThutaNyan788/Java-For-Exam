package revision1;

import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int enterInt;
        int totalValue = 1;
        while(true){
            System.out.println("Enter factorial : ");
            enterInt = sc.nextInt();

            if(enterInt == -1){
                break;
            }

            for(int i = enterInt ; i >= 1 ; i--){
                totalValue *= i;
            }
        }

        System.out.println(totalValue);
    }
}
