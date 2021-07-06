package warmup.company;

public class CompanyTester {
    public static void main(String[] args) {

        Manager bob = new Manager();
        System.out.println(bob.doWork());

        Manager jimmy = new Manager();
        jimmy.name = "James Jimmy";
        System.out.println(jimmy.name);

    }
}
