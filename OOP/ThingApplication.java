public class ThingApplication
{
    public static void main(String[] args)
    {
        Thing thing = new Thing();
        System.out.println(thing.getInteger());
        System.out.println(thing.getBool());
        System.out.println(thing.getStr());
        System.out.println(thing.getDoub());
    }
}