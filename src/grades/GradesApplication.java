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


        bob.recordAttendance("2021-07-12", "P");
        bob.recordAttendance("2021-07-13", "a");
        bob.recordAttendance("2021-07-14", "P");
        bob.recordAttendance("2021-07-15", "P");
        bob.recordAttendance("2021-07-16", "P");

        jimmy.recordAttendance("2021-07-12", "P");
        jimmy.recordAttendance("2021-07-13", "P");
        jimmy.recordAttendance("2021-07-14", "P");
        jimmy.recordAttendance("2021-07-15", "P");
        jimmy.recordAttendance("2021-07-16", "P");

        mondo.recordAttendance("2021-07-12", "A");
        mondo.recordAttendance("2021-07-13", "P");
        mondo.recordAttendance("2021-07-14", "p");
        mondo.recordAttendance("2021-07-15", "P");
        mondo.recordAttendance("2021-07-16", "a");

        aaron.recordAttendance("2021-07-12", "P");
        aaron.recordAttendance("2021-07-13", "P");
        aaron.recordAttendance("2021-07-14", "a");
        aaron.recordAttendance("2021-07-15", "a");
        aaron.recordAttendance("2021-07-16", "A");


        // -=-=-=-=-=-=-=-=-=-=-=-=-=-= start of program -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

        System.out.println("\nWelcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
        System.out.printf("|%s| |%s| |%s| |%s|\n", bob.getGitHubUsrName(), jimmy.getGitHubUsrName(), mondo.getGitHubUsrName(), aaron.getGitHubUsrName());

        boolean keepGoing = true;
        Input commandInput = new Input();

        while (keepGoing) {
            System.out.println("\nWhat would you like to do?\n\n" +
                    "\t0 - Exit\n" +
                    "\t1 - View individual student info\n" +
                    "\t2 - View ALL students' grades\n" +
                    "\t3 - View overall class average\n" +
                    "\t4 - Print csv report of all students\n");

            switch (commandInput.getInt(0, 4)) {
                case 0:
                    System.out.println("\nGoodbye, and have a wonderful day!\nExiting program...");
                    keepGoing = false;
                    break;
                case 1:
                    boolean moreStudents = true;
                    while (moreStudents) {
                        String choice = "";
                        choice = commandInput.getString("What student would you like to see more information on?");

                        switch (choice) {
                            case "BobnBob":
                                System.out.printf("\nName: %s  -- GitHub Username: %s\nCurrent grade average: %s\n" +
                                        "List of grades: %s\nAttendance percentage: %s%%\nDates found to be absent: %s\n",
                                        bob.getName(), bob.getGitHubUsrName(), bob.getGradeAverage(), bob.getGrades(), bob.attendancePercentage(), bob.datesAbsent());
                                break;
                            case "Jimmithy":
                                System.out.printf("\nName: %s  -- GitHub Username: %s\nCurrent grade average: %s\n" +
                                        "List of grades: %s\nAttendance percentage: %s%%\nDates found to be absent: %s\n",
                                        jimmy.getName(), jimmy.getGitHubUsrName(), jimmy.getGradeAverage(), jimmy.getGrades(), jimmy.attendancePercentage(), jimmy.datesAbsent());
                                break;
                            case "DrinkMondo":
                                System.out.printf("\nName: %s  -- GitHub Username: %s\nCurrent grade average: %s\n" +
                                        "List of grades: %s\nAttendance percentage: %s%%\nDates found to be absent: %s\n",
                                        mondo.getName(), mondo.getGitHubUsrName(), mondo.getGradeAverage(), mondo.getGrades(), mondo.attendancePercentage(), mondo.datesAbsent());
                                break;
                            case "ronronron":
                                System.out.printf("\nName: %s  -- GitHub Username: %s\nCurrent grade average: %s\n" +
                                        "List of grades: %s\nAttendance percentage: %s%%\nDates found to be absent: %s\n",
                                        aaron.getName(), aaron.getGitHubUsrName(), aaron.getGradeAverage(), aaron.getGrades(), aaron.attendancePercentage(), aaron.datesAbsent());
                                break;
                            default:
                                System.out.printf("\nSorry, no student found with the GitHub username of '%s'.\n", choice);
                                break;
                        }
                        boolean anotherStudent = commandInput.yesNo("Would you like to see another student?");
                        if (!anotherStudent) {
                            moreStudents = false;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Current students and their grades:");
                    for (Student student : students.values()) {
                        System.out.printf("\nStudent: %s\nGrades: %s\n", student.getName(), student.getGrades());
                    }
                    break;
                case 3:
                    double total = 0;
                    for (Student student : students.values()) {
                        total += student.getGradeAverage();
                    }
                    System.out.printf("\nAverage grade of all students is: %.2f\n", total / students.size());
                    break;
                case 4:
                    System.out.println("\nname,github_username,average");
                    for (Student student : students.values()) {
                        System.out.printf("%s,%s,%s\n", student.getName(), student.getGitHubUsrName(), student.getGradeAverage());
                    }
                    break;
                default:
                    break;
            }
            if (!keepGoing) {
                break;
            } else {
                boolean moreInfo = commandInput.yesNo("Would you like to see more scholastic information?");
                if (!moreInfo) {
                    System.out.println("\nGoodbye, and have a wonderful day!\nExiting program...");
                    keepGoing = false;
                }
            }
        }
    }

}
