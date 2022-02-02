import java.util.ArrayList;
public class Student {

    private String name;
    private  String purpose;
    private static ArrayList<Student> students = new ArrayList<>();

    public Student(String name, String purpose) {
        this.name = name;
        this.purpose = purpose;
        students.add(this);
    }

    public String getName() {
        return name;
    }

    public String getPurpose() {
        return purpose;
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }
}
