package revision3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str ;

        while(true){
            System.out.println("Enter word : ");
            str = sc.nextLine();

            if(str.equalsIgnoreCase("STOP")){
                System.out.println("Program Terminated");
                break;
            }

            String origin = str;
            StringBuffer sb  = new StringBuffer(str);

            if( origin.equalsIgnoreCase(sb.reverse().toString())){
                System.out.println("Palindrome");
            }else{
                System.out.println("not Palindrome");
            }
        }
    }
}
