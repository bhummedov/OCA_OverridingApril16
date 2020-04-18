package testProject.models;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        Person joe =new Person("joe");
        Person diana = new Doctor("diana", "pediatrist");
        Doctor ana = new Doctor("ana", "eyeDoc");
//        joe.speak();
//        diana.speak();
//        ana.speak();
        ArrayList<Person> personList = new ArrayList();
        Person p1 = new Person("adam");
        Person p2 = new Person("john");
        Person p3 = new Person("jennifer");
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        Person pRandom = new Person("john");
        boolean isRandomExistInPerson  = personList.contains(pRandom);
        System.out.println(isRandomExistInPerson);


        p1.equals(pRandom);
    }
}
