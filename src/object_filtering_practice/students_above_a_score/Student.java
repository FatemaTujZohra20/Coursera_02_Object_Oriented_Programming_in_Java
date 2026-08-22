package object_filtering_practice.students_above_a_score;

public class Student {
    
    private String studentName;
    private float score;
    
    // Setters for student name and score
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public void setScore(float score) {
        this.score = score;
    }
    
    // Getters for student name and score
    public String getStudentName() {
        return this.studentName;
    }
    
    public float getScore() {
        return this.score;
    }
    
    // Display student information
    @Override
    public String toString() {
        return "Student Name - " + this.studentName
                + "\nScore - " + String.format("%.2f", this.score);
    }
}
