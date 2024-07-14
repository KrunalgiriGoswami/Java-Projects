package Project.ResultSystem;

public class Result {
    private Student student;
    private String examName;
    private int[] marks;
    private int totalMarks;
    private boolean passed;

    public Result(Student student, String examName, int[] marks) {
        this.student = student;
        this.examName = examName;
        this.marks = marks;
        computeTotalMarks();
        computePassStatus();
    }

    private void computeTotalMarks() {
        totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
    }

    private void computePassStatus() {
        passed = student.isPassed(40); // Assuming pass mark is 40 for all subjects
    }

    public void displayResult() {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Class: " + student.getClassName());
        System.out.println("Exam Name: " + examName);
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("- Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Result: " + (passed ? "Passed" : "Failed"));
    }
}

