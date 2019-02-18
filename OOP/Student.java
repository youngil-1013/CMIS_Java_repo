public class Student
{
    private String name;
    private double GPA;
    private int grade;

    public Student()
    {
        name = "";
        GPA = 0.0;
        grade = 0;
    }

    public Student(String Name)
    {
        name = Name;
    }

    public Student(double gpa)
    {
        this("Bob Ross");
        GPA = gpa;
    }

    public Student(int Grade)
    {
        this(4.0);
        grade = Grade;
    }

    public String toString()
    {
        return String.format("Name: %s\nGPA: %b\nGrade Level: %i", name, GPA, grade);
    }
}
