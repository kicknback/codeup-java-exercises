import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person Finky = new Person("Tiffany");
        Person Diamond = new Person("Diamond");
        Person Josh = new Person("Josh");
        Person Jesse = new Person("Jesse");

        Person[] People = {Finky, Diamond, Josh};

        Person[] NewPerson = addPerson(People, new Person("Jesse"));
        for (Person people : NewPerson) {
            System.out.println(people.getName());
        }

//        System.out.println(Arrays.toString(addPerson(People, Jesse)));


    }

    public static Person[] addPerson(Person[] People, Person addPerson) {
        Person[] PeopleTwo = new Person[People.length + 1];

        for (int i = 0; i < People.length; i++) {
            PeopleTwo[i] = People[i];
        }

        PeopleTwo[People.length] = addPerson;

        return PeopleTwo;


    }






}