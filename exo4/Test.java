package exo4;

import exo3.Point;
import exo3.PointCol;

public class Test {

    public static void main(String[] args) {
        Point[] tab;
        tab = new Point[5];
        Point p1 = new Point(34, 67);
        PointCol p2 = new PointCol(45, 2, (byte) 27);
        Point p3 = new Point(2, -3);
        PointCol p4 = new PointCol(-34, 23, (byte) 13);
        Point p5 = new Point(2, -65);
        tab[0] = p1;
        tab[1] = p2;
        tab[2] = p3;
        tab[3] = p4;
        tab[4] = p5;
        for (int i = 0; i < tab.length; i++) {
            tab[i].afficher();
        }

    }
}
