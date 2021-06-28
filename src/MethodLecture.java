public class MethodLecture {


    public static void main(String[] args) {

        //    TODO: create a new method that accepts the name of a basketball
        //     team (ex: the spurs) and returns a String that says
        //     "[basketballTeam] is the best team.". Invoke that method within
        //     your main method (remember to pass in the name of the basketball
        //     team). print out the result of the new method.

        System.out.println(bTeam("Spurs"));
        System.out.println(charNum(bTeam("Spurs")));

        //    TODO: create a new method that accepts the string created from the
        //     first method and returns the number of characters in that string.
    }

    public static String bTeam(String team) {
        return String.format("%s is the best team.", team);
    }

    public static int charNum(String input) {
        return input.length();
    }

}
