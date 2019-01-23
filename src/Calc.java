import java.util.Scanner;

public class Calc {


    Line compareLines(Line l1, Line l2) {
        double lenght1 = calcLength(l1);
        double lenght2 = calcLength(l2);
        if (lenght1 > lenght2) {
            return l1;
        }
        return l2;
    }

    double calcLength(Line l) {
        double length = Math.sqrt(Math.pow((l.getpStart().getPointX() - l.getpEnd().getPointX()), 2.0) +
                Math.pow(l.getpStart().getPointY() - l.getpEnd().getPointY(), 2.0));

        return length;
    }


    void showInfoAboutLines(Line line){
        System.out.println("Dlugosc linii: " + calcLength(line));
        System.out.println("Punkt początkowy: X: " + line.getpStart().getPointX());
        System.out.println("Punkt początkowy: Y: " + line.getpStart().getPointY());
        System.out.println("Punkt końcowy: X: " + line.getpEnd().getPointX());
        System.out.println("Punkt końcowy: Y: " + line.getpEnd().getPointY());
        System.out.println("----");
    }

    Point loadData () {
        Point point = new Point();
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj wspolrzedna X punktu : ");
        double x = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj wspolrzedna Y punktu : ");
        double y = sc.nextInt();
        sc.nextLine();
        point.setPointX(x);
        point.setPointY(y);


        return point;
    }
}
