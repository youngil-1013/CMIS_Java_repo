public class Course
{
    private String courseName;
    private Double grade;
    
    public Course(String courseName, Double grade)
    {
        this.courseName = courseName;
        this.grade = grade;
    }
    
    public Double getGrade()
    {
        return grade;
    }
    
    public String getName()
    {
        return courseName;
    }
}
