package revision2;

public class User {
    public static void main(String[] args) {
        AddressBook adb = new AddressBook();

        for(int i=0 ; i < 3 ; i++){
            adb.add();
        }

        adb.display();
        adb.search();
    }
}
