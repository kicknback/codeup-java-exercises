package oop;

public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        // tell me about a person
//        Person person = new Person("Casey", 31, "short", "US National");
        Person person = new Person();
        Person person1 = new Person();

        person1.setName("Tiffany");
        person.setName("Casey");
        System.out.println(person1.getEntertainment("tubing the river."));
        System.out.println(person.getEntertainment("ride rollercoasters."));
    }

}
