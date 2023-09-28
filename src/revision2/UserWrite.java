package revision2;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UserWrite {
    public static void main(String[] args) throws IOException,FileNotFoundException{
        File file = new File("wordlist.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        System.out.println("Enter words to save in file : ");
        Scanner scanner = new Scanner(System.in);
        String input;
        while(true)
        {
            input = scanner.next();
            if(input.equalsIgnoreCase("STOP"))
                break;
            pw.println(input);
        }
        pw.close();
        String str = "";
        String shortest, longest;
        int sum = 0, avg_len = 0;
        int wordCount = 0;

        Scanner s = new Scanner(file);
        str = s.nextLine();
        shortest = str;
        longest = str;

        while (s.hasNext())
        {
            wordCount++;
            str = s.nextLine();

            if(longest.length()<str.length())
                longest = str;
            if(shortest.length()>str.length())
            {
                shortest = str;
            }
            sum += str.length();

        }
        avg_len = sum/wordCount;
        System.out.println("The longest word is:" + longest);
        System.out.println("The shortest word is:" + shortest);
        System.out.println("Average length of the words:" + avg_len);
    }
}
