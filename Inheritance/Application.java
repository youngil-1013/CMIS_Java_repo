import java.util.*;
public class Application
{
    public static void main(String args[]){
        List<Entity> entities = new ArrayList<Entity>();

        Thing t1 = new Thing("it");
        entities.add(t1);

        Person Sehan = new Person("Sehan",19,'M');
        Sehan.setAge(11);
        entities.add(Sehan);

        Place p1 = new Place("New York");
        p1.setPopulation(400);
        entities.add(p1);

        Idea I1 = new Idea();
        I1.setPopularity(4000);
        entities.add(I1);

        for(Entity entity: entities){
            System.out.println(entity);
            if (entity instanceof Idea){
                Idea e = (Idea)entity;
                System.out.println(e.getPopularity());
            }
        }
    }
}
