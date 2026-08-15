package oop_basic_in_java.student_performance_system_01;

public class StudentProfile {
    
    private String studentName;
    private int studentAge;
    private float score;
    
    // Setter for student name
    public void setStudentName (String studentName) {
        this.studentName = studentName;
    }
    
    // Setter for student age
    public void setStudentAge (int studentAge) {
        this.studentAge = studentAge;
    }
    
    // Setter for score
    public void setScore (float score) {
        this.score = score;
    }
    
    // Getter for student name
    public String getStudentName () {
        return this.studentName;
    }
    
    // Getter for student age
    public int getStudentAge () {
        return this.studentAge;
    }
    
    // Getter for student score
    public float getScore () {
        return this.score;
    }
    
    // Display student information
    @Override
    public String toString () {
        return "Name - " + this.studentName
                + "\nAge - " + this.studentAge
                + "\nScore - " + String.format("%.2f", this.score);
    }
    
    
}
