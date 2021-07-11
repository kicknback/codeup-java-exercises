package grades;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Student {

    private String name;
    private String gitHubUsrName;
    private ArrayList<Integer> grades;

    public Student(String name, String gitHubUsrName, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
        this.gitHubUsrName = gitHubUsrName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public String getGitHubUsrName() {
        return gitHubUsrName;
    }

    public void setGitHubUsrName(String gitHubUsrName) {
        this.gitHubUsrName = gitHubUsrName;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        DecimalFormat df = new DecimalFormat("#.##");
        double total = 0;
        for (Integer grade : grades) {
            total += grade;
        }
        return Double.parseDouble(df.format(total / grades.size()));
    }

//    public void getAllAgrades

}
