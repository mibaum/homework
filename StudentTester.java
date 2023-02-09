package schoolapplication;

public class StudentTester {
    public static void main(String[] args) {
        Student Jim = new Student(111222, "jim");
        System.out.println(Jim);
        Jim.namechange("Bob");
        System.out.println(Jim);


    }
}
