package grades;

import java.util.ArrayList;

public class GradesApplication {

    public static void main(String[] args) {

        ArrayList<Integer> bobsGrades = new ArrayList<Integer>(0);
        Student bob = new Student("Boberton", bobsGrades);

        ArrayList<Integer> jimsGrades = new ArrayList<Integer>(0);
        Student jimmy = new Student("Jimmithy", jimsGrades);

        ArrayList<Integer> mondosGrades = new ArrayList<Integer>(0);
        Student mondo = new Student("Mondo", mondosGrades);

        bob.addGrade(89);
        bob.addGrade(96);
        bob.addGrade(77);
        System.out.println(bob.getGrades());
        System.out.println(bob.getGradeAverage());

    }

}
