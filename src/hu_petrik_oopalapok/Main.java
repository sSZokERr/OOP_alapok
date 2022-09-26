package hu_petrik_oopalapok;
import pont.Pont;
import kor.Kor;

public class Main {
    public static void main(String[] args) {
        //OOP alapok
        Pont p1 = new Pont();
        Pont p2 = new Pont(3, 6);
        Pont p3 = new Pont(100);



        System.out.println(p1);
        System.out.println(p2);
        System.out.printf("A(z) %s pont tavolsaga az origotol: %.3f", p3, p3.getTavolsagAzOrigotol());
        System.out.printf("A(z) %s pont tavolsaga az origotol: %s ponttol %.3f", p2, p3, p2.tavolsag(p3));
        System.out.println();


        Pont[] pontok = new Pont[100];
        for (int i = 0; i < 100; i++) {
            pontok[i] = new Pont(15);
        }


    }
}