package grades;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        Student bob = new Student("BobnBob", new ArrayList<>());

        Student jimmy = new Student("Jimmithy", new ArrayList<>());

        Student mondo = new Student("DrinkMondo", new ArrayList<>());

        Student aaron = new Student("ronronron", new ArrayList<>());

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
//
//        System.out.println();


//        System.out.println(mondo.getName());
//        System.out.println(mondo.getGrades());
//        System.out.println(df.format(mondo.getGradeAverage()));

        HashMap<String, Student> students = new HashMap<>();
        students.put(bob.getName(), bob);
        students.put(jimmy.getName(), jimmy);
        students.put(mondo.getName(), mondo);
        students.put(aaron.getName(), aaron);

        System.out.println(jimmy.getName());
        System.out.println(students.get(mondo.getName()).getGradeAverage());

    }

}
