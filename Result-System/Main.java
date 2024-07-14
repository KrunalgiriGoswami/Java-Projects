package Project.ResultSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create subjects
        Subject physics = new Subject("Physics");
        Subject chemistry = new Subject("Chemistry");
        Subject maths = new Subject("Maths");

        // Create teacher and add students
        Teacher teacher = new Teacher(3); // Maximum 3 students
        teacher.addStudent(new Student("Alice", 101, "XII-A", 3)); // 3 subjects
        teacher.addStudent(new Student("Bob", 102, "XII-A", 3));
        teacher.addStudent(new Student("Carol", 103, "XII-A", 3));

        // Teacher enters marks for students
        teacher.enterMarks(101, new int[]{75, 80, 85}); // Physics, Chemistry, Maths
        teacher.enterMarks(102, new int[]{60, 70, 65});
        teacher.enterMarks(103, new int[]{35, 40, 45});

        // Example: Display result for a student
        int rollNoToSearch = 102;
        Student foundStudent = teacher.findStudentByRollNo(rollNoToSearch);
        if (foundStudent != null) {
            Result result = new Result(foundStudent, "Final Exam", foundStudent.getMarks());
            result.displayResult();
        } else {
            System.out.println("Student with roll number " + rollNoToSearch + " not found.");
        }
    }
}
