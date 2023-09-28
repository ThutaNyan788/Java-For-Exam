package revision2;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class ObjectRW {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);

        Person[] person = new Person[3];

        for(int i=0 ; i < person.length ; i++){
            System.out.println("enter name : ");
            String name = sc.nextLine();

            System.out.println("enter age :");
            int age = sc.nextInt();

            System.out.println("enter gender");
            String gender = sc.nextLine();

            System.out.println("enter address :");
            String address = sc.nextLine();

            person[i] = new Person(name,age,gender,address);
        }

        File fobj = new File("ObjectRW.txt");
        FileOutputStream fout = new FileOutputStream(fobj);
        ObjectOutputStream fobjout = new ObjectOutputStream(fout);

        fobjout.writeObject(person);
        fobjout.close();


        FileInputStream finput = new FileInputStream(fobj);
        ObjectInputStream objinput = new ObjectInputStream(finput);
        Person[] people = (Person[]) objinput.readObject();

        int youngest  = people[0].getAge();
        int oldest = people[0].getAge();

        for (int i = 0; i < people.length; i++) {

            if(youngest > people[i].getAge()){
                youngest = people[i].getAge();
            }

            if(oldest < people[i].getAge()){
                oldest = people[i].getAge();
            }
        }

        System.out.println("Youngest : "+youngest);
        System.out.println("Oldest : "+oldest);


    }
}
