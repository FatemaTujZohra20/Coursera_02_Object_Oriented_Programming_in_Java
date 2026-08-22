package object_filtering_practice.students_above_a_score;

public class StudentCalculator {
    
    // Students whose score is greater than a minimum given score
    // Implemented the two-pass filtering pattern to create an exact-sized result array and avoid unnecessary null positions.
    public static Student[] studentsAboveGivenScore(Student[] students, float minimumScore){
        
        int matchingStudentsCount = 0;
        
        for(int i = 0; i < students.length; i++){
            if(students[i] != null){
                if(students[i].getScore() > minimumScore){
                    matchingStudentsCount++;
                }
            }
        }
        
        Student[] studentsAboveGivenMinimumScore = new Student[matchingStudentsCount];
        
        int resultOfMatchingStudentsCount = 0;
        
        for(int i = 0; i < students.length; i++){
            if(students[i] != null){
                if(students[i].getScore() > minimumScore){
                    studentsAboveGivenMinimumScore[resultOfMatchingStudentsCount] = students[i];
                    resultOfMatchingStudentsCount++;
                }
            }
        }
        
        return  studentsAboveGivenMinimumScore;
    }
}
