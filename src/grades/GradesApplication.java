package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        Student bob = new Student("Bob","BobnBob", new ArrayList<>());

        Student jimmy = new Student("Jimmy","Jimmithy", new ArrayList<>());

        Student mondo = new Student("Mondo","DrinkMondo", new ArrayList<>());

        Student aaron = new Student("Aaron","ronronron", new ArrayList<>());

        bob.addGrade(89);
        bob.addGrade(96);
        bob.addGrade(77);

        mondo.addGrade(73);
        mondo.addGrade(81);
        mondo.addGrade(99);

        jimmy.addGrade(67);
        jimmy.addGrade(73);
        jimmy.addGrade(86);

        aaron.addGrade(99);
        aaron.addGrade(100);
        aaron.addGrade(92);


//        System.out.println(bob.getGrades());
//        System.out.println(df.format(bob.getGradeAverage()));
//        System.out.println();
//        System.out.println(mondo.getName());
//        System.out.println(mondo.getGrades());
//        System.out.println(df.format(mondo.getGradeAverage()));

        HashMap<String, Student> students = new HashMap<>();
        students.put(bob.getName(), bob);
        students.put(jimmy.getName(), jimmy);
        students.put(mondo.getName(), mondo);
        students.put(aaron.getName(), aaron);

//        System.out.println(jimmy.getName());
//        System.out.println(students.get(mondo.getName()).getGradeAverage());

        System.out.println("\nWelcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
        System.out.printf("|%s| |%s| |%s| |%s|\n", bob.getGitHubUsrName(), jimmy.getGitHubUsrName(), mondo.getGitHubUsrName(), aaron.getGitHubUsrName());

        boolean keepGoing = true;
        Input commandInput = new Input();

        while (keepGoing) {

            String choice = commandInput.getString("What student would you like to see more information on?");

            switch (choice) {
                case "BobnBob":
                    System.out.printf("Name: %s  -- GitHub Username: %s\nCurrent grade average: %s\n", bob.getName(), bob.getGitHubUsrName(), bob.getGradeAverage());
                case "Jimmithy":
                    System.out.printf("Name: %s  -- GitHub Username: %s\nCurrent grade average: %s\n", jimmy.getName(), jimmy.getGitHubUsrName(), jimmy.getGradeAverage());
                case "DrinkMondo":
                    System.out.printf("Name: %s  -- GitHub Username: %s\nCurrent grade average: %s\n", mondo.getName(), mondo.getGitHubUsrName(), mondo.getGradeAverage());
                case "ronronron":
                    System.out.printf("Name: %s  -- GitHub Username: %s\nCurrent grade average: %s\n", aaron.getName(), aaron.getGitHubUsrName(), aaron.getGradeAverage());
                default:
                    System.out.printf("Sorry, no student found with the GitHub username of '%s'.", choice);
            }


        }
    }

}
