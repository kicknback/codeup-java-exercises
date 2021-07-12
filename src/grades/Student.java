package grades;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {

    private String name;
    private String gitHubUsrName;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance = new HashMap<>();

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

    public HashMap<String, String> getAttendance() {
        return attendance;
    }

    public double getGradeAverage() {
        DecimalFormat df = new DecimalFormat("#.##");
        double total = 0;
        for (Integer grade : grades) {
            total += grade;
        }
        return Double.parseDouble(df.format(total / grades.size()));
    }

    public void recordAttendance(String date, String value) {
        if (value.equalsIgnoreCase("p") || value.equalsIgnoreCase("a")) {
            if (attendance.containsKey(date)) {
                System.out.println("There is already an entry for that date.  Cannot add entry.");
            } else {
                attendance.put(date, value.toUpperCase());
            }
        } else {
            System.out.println("Attendance values must be 'P' or 'A'.  Cannot add entry");
        }
    }

    public double attendancePercentage() {
        DecimalFormat df = new DecimalFormat("#.##");
        double presentDays = 0;
        for (String day : attendance.values()) {
            if (day.equalsIgnoreCase("p")) {
                presentDays++;
            }
        }
        return Double.parseDouble(df.format((presentDays / attendance.size()) * 100));
    }

    public ArrayList<String> datesAbsent() {
        ArrayList<String> dates = new ArrayList<>();
        for (Map.Entry<String, String> item : attendance.entrySet()) {
            String value = item.getValue();
            if (value.equalsIgnoreCase("a")) {
                dates.add(item.getKey());
            }
        }
        return dates;
    }


}
