package Project.ResultSystem;

public class Teacher {
    private Student[] students;
    private int numStudents;

    public Teacher(int maxStudents) {
        this.students = new Student[maxStudents];
        this.numStudents = 0;
    }

    public void addStudent(Student student) {
        if (numStudents < students.length) {
            students[numStudents] = student;
            numStudents++;
        } else {
            System.out.println("Cannot add more students. Array is full.");
        }
    }

    public void enterMarks(int rollNo, int[] marks) {
        Student student = findStudentByRollNo(rollNo);
        if (student != null) {
            for (int i = 0; i < marks.length; i++) {
                student.setMarks(i, marks[i]);
            }
        } else {
            System.out.println("Student with roll number " + rollNo + " not found.");
        }
    }

    public Student findStudentByRollNo(int rollNo) {
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getRollNo() == rollNo) {
                return students[i];
            }
        }
        return null;
    }
}
