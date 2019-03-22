import java.util.*;
public class School
{
    private List<Student> students;
    private String name;
    public School(String name)
    {
        students = new ArrayList<Student>();
        this.name = name;
    }
    
    public void addStudent(Student student)
    {
        students.add(student);
    }
    
    public String getName(){
        return name;
    }
    
    public Double getAvgGPA(){
        int sklSize = students.size();
        Double totGPA = 0.0;
        for (Student student: students)
        {
            totGPA += student.getAVG();
        }
        Double avgGPA = totGPA/sklSize;
        return avgGPA;
    }
 
    public List<Student> getStudents(){
        return students;
    }
    
    public String toString(){
        String out = "";
        out += "Name: " + name + "\n";
        out += "Enrollment: " + students.size();
        return out;
    }
}
