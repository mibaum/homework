package schoolapplication;

public class Student {
    private int ID_number;
    private String Name;


    public Student (int ID_number, String Name) {
        this.ID_number = ID_number;
        this.Name = Name;
    }
    public void namechange (String newname) {
        this.Name = newname;

    }

    public String toString() {
        return Name + " has ID number " + ID_number;
    }





}
