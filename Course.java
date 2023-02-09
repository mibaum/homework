package schoolapplication;

public class Course {
    private String department;
    private int course_number;
    private int credit_hours;


    public Course (String department, int course_number, int credit_hours ){
        this.department = department;
        this.course_number = course_number;
        this.credit_hours = credit_hours;
    }
    public String toString() {
        return "this course's number is " + course_number + " in the " + department + "department , and has " + credit_hours + " credit hours";

    }

}


