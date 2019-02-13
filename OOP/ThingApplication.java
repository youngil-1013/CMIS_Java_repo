public class ThingApplication
{
    public static void main(String[] args)
    {
        Thing thing = new Thing();
        Thing thinge = new Thing(3.4);
        System.out.println(thing.getInteger());
        System.out.println(thing.getBool());
        System.out.println(thing.getStr());
        System.out.println(thing.getDoub());
        System.out.println(thinge.getInteger());
        System.out.println(thinge.getBool());
        System.out.println(thinge.getStr());
        System.out.println(thinge.getDoub());
    }
}