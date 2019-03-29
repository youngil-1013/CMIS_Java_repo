public class Entity
{
    private String name;
    private int age;

    public Entity(String name){
        this.name = name;
    }

    public Entity(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        String out = "";
        out += super.toString() + "\n";
        out += "name: " + name + "\n";
        out += "age: " + age + "\n";
        return out;
    }
}
