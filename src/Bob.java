import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Say something to Bob: ");
        String sayToBob = sc.nextLine();

        if (sayToBob.isEmpty()) {
            System.out.println("Fine. Be that way!");
        } else if (sayToBob.lastIndexOf("?") != -1) {
            System.out.println("Sure");
        } else if (sayToBob.lastIndexOf("!") != -1) {
            System.out.println("Whoa, chill out man");
        } else {
            System.out.println("Whatever");
        }



    }
}
