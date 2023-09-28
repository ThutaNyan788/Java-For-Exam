package revision2;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    String name;String gender; String address;
     ArrayList<Person> arr = new ArrayList<>();

    int age;
    public  void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name :");
        name = sc.nextLine();
        System.out.println("enter age : ");
        age = sc.nextInt();
        System.out.println("enter gender : ");
        gender = (sc.nextLine());
        System.out.println("enter address : ");
        address = sc.nextLine();

        Person p = new Person(name,age,gender,address);
        arr.add(p);
    }

    public  void display(){
        for(Person p : arr){
            System.out.println("Name :"+p.getName());
        System.out.println("Age :"+p.getAge());
        System.out.println("gender : "+p.getGender());
        System.out.println("address : "+p.getAddress());
        }

    }

    public   void search(){
        Scanner sc = new Scanner(System.in);
        if(arr.size() == 0){
            System.out.println("Person array is empty");
        }else{
            System.out.println("Enter search name : ");
            String searchName = sc.nextLine();

            int i =0;

            for(Person p : arr){
                if(p.getName().equalsIgnoreCase(searchName)){
                    System.out.println(p.getName()+ " "+ p.getAddress() +" "+p.getGender()+" "+ p.getAddress());
                    break;
                }

                i++;
            }

            if(i == arr.size()) System.out.println("Person not Found?");
        }
    }
}
