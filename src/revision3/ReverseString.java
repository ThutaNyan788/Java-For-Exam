package revision3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str;

        while(true){
            System.out.println("Enter word : ");
            str = sc.nextLine();

            if(str.equalsIgnoreCase("STOP")){
                break;
            }

            StringTokenizer stk = new StringTokenizer(str);

            while(stk.hasMoreTokens()){
                StringBuffer sb = new StringBuffer(stk.nextToken());
                sb.reverse();
                System.out.print(sb+" ");
            }
        }

    }
}
