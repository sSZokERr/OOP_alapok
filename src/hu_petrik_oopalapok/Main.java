package hu_petrik_oopalapok;
import pont.Pont;

public class Main {
    public static void main(String[] args) {
        //OOP alapok
        Pont p1 = new Pont();
        Pont p2 = new Pont(3, 6);
        Pont p3 = new Pont(100);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}