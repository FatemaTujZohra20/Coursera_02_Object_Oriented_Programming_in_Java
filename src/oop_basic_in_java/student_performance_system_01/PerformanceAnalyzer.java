package oop_basic_in_java.student_performance_system_01;

public class PerformanceAnalyzer {
    
    // Compare the scores of two students
    public static void compareScores (
            StudentProfile firstStudent,
            StudentProfile secondStudent) {
        
        float firstScore = firstStudent.getScore();
        float secondScore = secondStudent.getScore();
        
        if (firstScore > secondScore) {
            System.out.println(
                    firstStudent.getStudentName()
                            + " has a higher score than "
                            + secondStudent.getStudentName());
        } else if (firstScore == secondScore) {
            System.out.println(
                    firstStudent.getStudentName()
                            + " and "
                            + secondStudent.getStudentName()
                            + " have the same score");
        } else {
            System.out.println(
                    secondStudent.getStudentName()
                            + " has a higher score than "
                            + firstStudent.getStudentName());
        }
    }
    
    // Check whether a student has passed
    public static void isPassed (StudentProfile student) {
        
        if (student.getScore() >= 40) {
            System.out.println(
                    student.getStudentName() + " has passed.");
        } else {
            System.out.println(
                    student.getStudentName() + " has failed");
        }
    }
    
    // Calculate average score
    public static float calculateAverageScore (
            StudentProfile[] studentList) {
        
        float totalScore = 0;
        int studentCount = 0;
        
        for (int i = 0; i < studentList.length; i++) {
            
            if (studentList[i] != null) {
                
                totalScore += studentList[i].getScore();
                studentCount++;
            }
        }
        
        if (studentCount > 0) {
            return totalScore / studentCount;
        }
        
        return 0;
    }
}
