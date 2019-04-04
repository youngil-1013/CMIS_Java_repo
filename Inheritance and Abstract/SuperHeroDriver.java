import java.util.*;
public class SuperHeroDriver{
    public static void main(String[] args){
        ArrayList<SuperHero> heroes = new ArrayList<SuperHero>();

        AsteroidMan ast = new AsteroidMan();
        ast.setSuitColor("Gray");
        ast.setCape(true);
        heroes.add(ast);

        FriedEggMan egg = new FriedEggMan();
        egg.setSuitColor("White");
        heroes.add(egg);

        StudentMan yik = new StudentMan();
        yik.setSuitColor("Blue");
        yik.setCape(true);
        heroes.add(yik);

        System.out.println("Original set of ArrayList heroes...");
        for (SuperHero hero: heroes){
            System.out.println(hero.toString());
        }
        System.out.println();

        SuperHero[][] capedHeroes = new SuperHero[3][3];
        int tmpW = 0;
        int tmpH = 0;
        for (int idx = 0; idx < heroes.size(); idx ++){
            SuperHero hero = heroes.get(idx);
            if (hero.isCaped()){
                SuperHero tmpHero = heroes.remove(idx);
                if (tmpW != 2){
                    capedHeroes[tmpH][tmpW] = tmpHero;
                    tmpW ++;
                }else{
                    tmpW = 0;
                    tmpH ++;
                    capedHeroes[tmpH][tmpW] = tmpHero;
                }
            }else{
                idx++;
            }
        }

        System.out.println("Printing 2D Array capedHeroes...");
        for (int h = 0; h < 3; h++){
            for (int w = 0; w < 3; w++){
                if (capedHeroes[h][w] == null){
                    System.out.print("null \t");
                }else{
                    System.out.print(capedHeroes[h][w].getHero() + "\t");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Printing contents of capedHeroes...");
        for (int h = 0; h < 3; h++){
            for (int w = 0; w < 3; w++){
                if (capedHeroes[h][w] != null){
                    System.out.println(capedHeroes[h][w]);
                }
            }
        }
        System.out.println();

        System.out.println("Remaining set of ArrayList heroes...");
        for (SuperHero hero: heroes){
            System.out.println(hero.toString());
        }
    }
}

