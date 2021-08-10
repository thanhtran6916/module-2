package student;

public class Student {
    private int id;
    private String  name;
    private static String college = "Tự do";

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static void setCollege() {
        college = "CodeGym";
    }

    public String displayStudent() {
        return "Student " + this.name + " " + this.id + " " + this.college;
    }
}
