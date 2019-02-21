public class PhoneApplication
{
    public static void main(String [] args)
    {
        Phone youngIlPhone = new Phone();
        Phone sehanPhone = new Phone(2016, "Samsung", 0.91);
        System.out.println(youngIlPhone.toString());
        System.out.println(sehanPhone.toString());
    }
}
