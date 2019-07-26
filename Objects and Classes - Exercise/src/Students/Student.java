package Students;

public class Student {
    private String firstName;
    private String lastName;
    private double grade;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGrade() {
        return grade;
    }

    public Student(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    @Override
    public String toString() {

        return String.format("%s %s: %.2f",firstName,lastName,grade);
    }
}
