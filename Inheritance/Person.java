public class Person extends Entity
{
    private int age;
    private char sex;
    Person()
    {
        super("Default Person");
        this.age = 0;
        this.sex = 'X';
    }
    
    Person(String name, int age, char sex)
    {
        super(name);
        this.age = age;
        this.sex = sex;
    }
    
    public String toString()
    {
        String out = "";
        out += super.toString();
        out += "age: " + age + "\n";
        out += "sex: " + sex + "\n";
        return out;
    }
}