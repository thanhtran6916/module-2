package student;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student my = new Student(3, "Thanh");

        System.out.println(my.displayStudent());

        Student.setCollege();

        System.out.println(my.displayStudent());
    }
}
