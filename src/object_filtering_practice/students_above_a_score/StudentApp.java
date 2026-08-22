package object_filtering_practice.students_above_a_score;

public class StudentApp {
    public static void main(String[] args) {
        
        Student student1 = new Student();
        student1.setStudentName("Alice");
        student1.setScore(85.00f);
        
        Student student2 = new Student();
        student2.setStudentName("Bob");
        student2.setScore(62.00f);
        
        Student student3 = new Student();
        student3.setStudentName("Charlie");
        student3.setScore(91.00f);
        
        Student student4 = new Student();
        student4.setStudentName("David");
        student4.setScore(74.00f);
        
        Student student5 = new Student();
        student5.setStudentName("Emma");
        student5.setScore(55.00f);
        
        Student[] students = new Student[6];
        
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;
        students[5] = null;
        
        System.out.println("=============== View all students info ===============");
        for(int i = 0; i < students.length; i++){
            if(students[i] != null){
                System.out.println(students[i]);
                System.out.println("----------------------------------------------------");
            }
        }
        
        // Students whose score is greater than a given minimum score
        Student[] studentsAboveGivenScore =
                StudentCalculator.studentsAboveGivenScore(students, 80.00f);
        System.out.println("=============== Student Above Number 80.00 ============");
        for(int i = 0; i < studentsAboveGivenScore.length; i++){
            if(studentsAboveGivenScore[i] != null){
                System.out.println(studentsAboveGivenScore[i]);
                System.out.println("-------------------------------------------------");
            }
        }
    }
}
