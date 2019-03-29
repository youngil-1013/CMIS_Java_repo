public class Person extends Entity
{
    private char sex;

    Person(){
        super("Default Person",0);
        this.sex = 'X';
    }

    Person(String name, int age, char sex){
        super(name, age);
        this.sex = sex;
    }

    public void setAge(int age){
        if (age < 150){
            super.setAge(age);
        }
    }

    public String toString(){
        String out = "";
        out += super.toString();
        out += "sex: " + sex + "\n";
        return out;
    }
}