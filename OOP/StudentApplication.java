public class StudentApplication
{
    public static void main(String[] args)
    {
        Student senior001 = new Student();
        System.out.println(senior001.toString());
        Student junior001 = new Student(11);
        System.out.println(junior001.toString());
    }
}
