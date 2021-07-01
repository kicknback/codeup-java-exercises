package oop;

public class Oberon {

    // TODO: CREATE A NEW "OBERON" CLASS WITH AT LEAST 6 PROPERTIES
    //  THAT DESCRIBE OUR OBERON COHORT. MAKE SURE TO INCLUDE
    //  AT LEAST THREE DIFFERENT TYPES OF DATA IN YOUR CLASS. IN A
    //  SEPARATE FILE, CREATE 3 INSTANCES OF THE OBERON CLASS AND
    //  PRINT OUT A STRING THAT USES AT LEAST 3 OF THOSE PROPERTIES
    //  TO DESCRIBE THAT OBERON INSTANCE.

    private String type;
    private String location;
    private int studentCount;
    private boolean enrolled;
    private String cohort;
    private int cohortLength;

    public Oberon (String type, String location, int studentCount, boolean enrolled, String cohort, int cohortLength) {
        this.type = type;
        this.location = location;
        this.studentCount = studentCount;
        this.enrolled = enrolled;
        this.cohort = cohort;
        this.cohortLength = cohortLength;
    }

    public String displayInfo() {
        return String.format("Hello.  This person is part of the %s cohort, located in %s.  There are approximately %s students", cohort, location, studentCount);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public boolean isEnrolled() {
        return enrolled;
    }

    public void setEnrolled(boolean enrolled) {
        this.enrolled = enrolled;
    }

    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }

    public int getCohortLength() {
        return cohortLength;
    }

    public void setCohortLength(int cohortLength) {
        this.cohortLength = cohortLength;
    }
}
