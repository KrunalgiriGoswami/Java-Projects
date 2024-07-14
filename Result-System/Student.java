package Project.ResultSystem;

public class Student {
    private String name;
    private int rollNo;
    private String className;
    private int[] marks; // Array to store marks for each subject

    public Student(String name, int rollNo, String className, int numSubjects) {
        this.name = name;
        this.rollNo = rollNo;
        this.className = className;
        this.marks = new int[numSubjects]; // Initialize marks array based on number of subjects
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getClassName() {
        return className;
    }

    public void setMarks(int index, int marksObtained) {
        marks[index] = marksObtained;
    }

    public int[] getMarks() {
        return marks;
    }

    public boolean isPassed(int passMark) {
        for (int mark : marks) {
            if (mark < passMark) {
                return false;
            }
        }
        return true;
    }
}
