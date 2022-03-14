import test.Person;

import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args)
    {
        System.out.println("Hello");
        ArrayList<String> myList = new ArrayList();
        myList.add("Bonjour");
        myList.add("1");
        System.out.println(myList);
        for (String item:
             myList) {
            System.out.println(item);        }

        Person max = new Person();
        max.setFirstName("Max");
        max.setLastName("Webber");
        System.out.println(max);
    }
}
