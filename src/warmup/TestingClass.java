package warmup;

public class TestingClass {
    public static void main(String[] args) {

        Parent newParent = new Parent();
        System.out.println(newParent.itsMe());

        SubClass newSubClass = new SubClass();
        System.out.println(newSubClass.itsSubby());

        System.out.println(newSubClass.itsMe());


    }
}
