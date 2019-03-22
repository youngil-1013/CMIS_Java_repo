import java.util.*;
public class Student
{
    private String name;
    private int gradeLevel;
    private List<Course> courses;
    private Double GPA = 0.0;

    public Student(String name, int gradeLevel){
        this.name = name;
        this.gradeLevel = gradeLevel;
        courses = new ArrayList<Course>();
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public Double getAVG(){
        int courseNum = courses.size();
        Double tot = 0.0;
        for (Course course: courses)
        {
            tot += course.getGrade();
        }
        Double avg = tot/courseNum;
        this.GPA = avg;
        return avg;
    }

    public String toString(){
        String out = "";
        out += "Name: " + name + "\n";
        out += "Grade Level: " + gradeLevel + "\n";
        out += "GPA: " + GPA + "\n";
        out += "Courses\n ------\n";
        int num = 1;
        for (Course course: courses){
            out += num + ") " + course.getName() + ": " + course.getGrade() + "\n";
            num ++;
        }
        return out;
    }
}
