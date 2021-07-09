package grades;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class GradesApplication {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##");

        Student bob = new Student("Boberton", new ArrayList<>());

        Student jimmy = new Student("Jimmithy", new ArrayList<>());

        Student mondo = new Student("Mondo", new ArrayList<>());

        bob.addGrade(89);
        bob.addGrade(96);
        bob.addGrade(77);
        System.out.println(bob.getGrades());
        System.out.println(df.format(bob.getGradeAverage()));

        System.out.println();

        mondo.addGrade(73);
        mondo.addGrade(81);
        mondo.addGrade(99);
        System.out.println(mondo.getName());
        System.out.println(mondo.getGrades());
        System.out.println(df.format(mondo.getGradeAverage()));

    }

}
