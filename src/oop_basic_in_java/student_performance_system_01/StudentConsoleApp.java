package oop_basic_in_java.student_performance_system_01;

import java.util.Scanner;

public class StudentConsoleApp {
    
    public static void main (String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        StudentProfile[] studentList = new StudentProfile[10];
        
        int studentCount = 0;
        
        while (true) {
            
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Show all students");
            System.out.println("2. Register a student");
            System.out.println("3. Check student result");
            System.out.println("4. Compare two students");
            System.out.println("5. Calculate average score");
            System.out.println("Any other key to exit");
            
            System.out.print("Choose an option: ");
            
            String userChoice = scanner.nextLine();
            
            // Option 1: Show students
            if (userChoice.equals("1")) {
                
                if (studentCount == 0) {
                    System.out.println("No students registered yet.");
                    continue;
                }
                
                System.out.println("\n===== Registered Students =====");
                
                for (int i = 0; i < studentList.length; i++) {
                    
                    if (studentList[i] != null) {
                        System.out.println(
                                "\nStudent " + (i + 1));
                        
                        System.out.println(studentList[i]);
                        
                        System.out.println("----------------------");
                    }
                }
            // Option 2: Register student
            } else if (userChoice.equals("2")) {
                
                if (studentCount == 10) {
                    
                    System.out.println("10 students have already been registered.");
                    
                    continue;
                }
                
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                
                System.out.print("Enter student age: ");
                int age = Integer.parseInt(scanner.nextLine());
                
                System.out.print("Enter student score: ");
                float score = Float.parseFloat(scanner.nextLine());
                
                StudentProfile student = new StudentProfile();
                
                student.setStudentName(name);
                student.setStudentAge(age);
                student.setScore(score);
                
                studentList[studentCount] = student;
                
                studentCount++;
                
                System.out.println("Student registered successfully.");
                
            // Option 3: Check result
            } else if (userChoice.equals("3")) {
                if (studentCount == 0) {
                    System.out.println("No students registered yet.");
                    continue;
                }
                
                System.out.print("Enter student number: ");
                
                int studentNumber = Integer.parseInt(scanner.nextLine());
                
                if (studentNumber < 1 ||
                        studentNumber > studentCount) {
                    System.out.println(
                            "Invalid student number.");
                    continue;
                }
                
                StudentProfile selectedStudent =
                        studentList[studentNumber - 1];
                
                PerformanceAnalyzer.isPassed(selectedStudent);
                
            // Option 4: Compare students
            } else if (userChoice.equals("4")) {
                if (studentCount < 2) {
                    System.out.println(
                            "At least two students are required."
                    );
                    continue;
                }
                
                System.out.print("Enter first student number: ");
                int firstNumber = Integer.parseInt(scanner.nextLine());
                
                System.out.print("Enter second student number: ");
                int secondNumber = Integer.parseInt(scanner.nextLine());
                
                if(firstNumber < 1 ||
                        firstNumber > studentCount ||
                        secondNumber < 1 ||
                        secondNumber > studentCount) {
                    
                    System.out.println("Invalid student number.");
                    continue;
                }
                
                StudentProfile  firstStudent = studentList[firstNumber - 1];
                StudentProfile secondStudent = studentList[secondNumber - 1];
                
                PerformanceAnalyzer.compareScores(
                        firstStudent,
                        secondStudent
                );
                
            // Option 5: Calculate average
            } else if (userChoice.equals("5")) {
                if (studentCount == 0) {
                    System.out.println("No students registered yet.");
                    continue;
                }
                
                float average = PerformanceAnalyzer.calculateAverageScore(studentList);
                
                System.out.println("Average score: " + String.format("%.2f", average));
                
            // Exit
            } else {
                System.out.println("Goodbye!");
                break;
            }

        }
        
        scanner.close();
    }
}
