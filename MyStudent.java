import java.util.ArrayList;
import java.util.List;

public class MyStudent {
    private int student_id;
    private String student_name;
    private List<Integer> grades;

    public MyStudent(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<>();
    }

    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }

    public String getStudentName() {
        return student_name;
    }

    public void setStudentName(String student_name) {
        this.student_name = student_name;
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Grade added successfully.");
        } else {
            System.out.println("Invalid grade. Grade should be between 0 and 100.");
        }
    }

    public static void main(String[] args) {
        MyStudent student = new MyStudent(123, "John Doe");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());

        student.setStudentId(456);
        student.setStudentName("Jane Smith");
        System.out.println("Updated Student ID: " + student.getStudentId());
        System.out.println("Updated Student Name: " + student.getStudentName());

        student.addGrade(85); // Valid grade
        student.addGrade(120); // Invalid grade
    }
}
