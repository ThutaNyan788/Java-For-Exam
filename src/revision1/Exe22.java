package revision1;

import java.util.Scanner;

public class Exe22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while(true){
            System.out.println("Enter word : ");
            str = sc.nextLine();

            if(str.length() == 0){
                break;
            }
            String original = str;
            StringBuffer sb =new StringBuffer(str);

            if(sb.reverse().toString().equals(original)){
                System.out.println(original+" is palindrome");
            }else{
                System.out.println(original+" is not palindrome");
            }
        }
    }
}
