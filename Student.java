public class Student {
    private String name;
    private int volunteerHours;

    public Student() {
        name = "Felix Huang";
        volunteerHours = 28;
    }

    public String toString() {
        return "My name is " + name + "\nMy accumulated volunteer hours are " + volunteerHours + " hours";
    }
}