package pack.groups;

import pack.sructure.base.Hero;

import java.util.concurrent.TimeUnit;

public class BattleField {
    private final Squad s1;
    private final Squad s2;

    public BattleField (int size){
        s1 = new Squad(size);
        s2 = new Squad(size);
    }

    public void  fight(){
        int step = 1;
        Hero h1 = null, h2 = null;

        while (s1.anyAlive() && s2.anyAlive()){
            System.out.println("step: " + step++);
            h1 = s1.getHero();
            h2 = s2.getHero();
            //
            h1.takeDamage(h2.attack());
            System.out.println(h1);
            System.out.println(h2);
            System.out.println();
            //
            if (h1.isAlive() && h2.isAlive()){
                h2.takeDamage(h1.attack());
                System.out.println(h1);
                System.out.println(h2);
                System.out.println();
            }
            System.out.println("\n");
            //
            try {
                //1
                //Thread.sleep(1000);
                //2
                TimeUnit.SECONDS.sleep(1);
            }catch (Exception e){
                e.printStackTrace(System.out);
            }
        }
        //win

        if (s1.anyAlive()) {
            System.out.println("1 Squad Win");
            System.out.println("The remaining unit " + h1);
        }
        else {
            System.out.println("2 Squad Win");
            System.out.println("The remaining unit " + h2);
        }

        System.out.println("Live units of the first command: " + s1.anyAlive());
        System.out.println("Live units of the second command: " + s2.anyAlive());


    }


}
