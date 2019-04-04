

public class StudentDriver{
    public static void main (String[] args){
        Student[][] studentBody = new Student[3][2];

        PostGraduate paul = new PostGraduate("Paul", "Math", 5);
        PostGraduate pat = new PostGraduate("Pat", "Physics", 7);
        studentBody[0][0] = paul;
        studentBody[0][1] = pat;

        Graduate grace = new Graduate("Grace", "Biology", 6);
        Graduate george = new Graduate("George", "Chemistry", 6);
        studentBody[1][0] = grace;
        studentBody[1][1] = george;

        UnderGrad uriel = new UnderGrad("Uriel", "English", 7);
        UnderGrad ulysses = new UnderGrad("Ulysses", "History", 6);
        studentBody[2][0] = uriel;
        studentBody[2][1] = ulysses;
        
        for (int h = 0; h < 3; h ++){
            for (int w = 0; w < 2; w ++){
                System.out.println (studentBody[h][w]);
            }
            System.out.println();
        }
    }
}

