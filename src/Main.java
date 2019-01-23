import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calc calc = new Calc();
        Point p1 = calc.loadData();
        Point p2 = calc.loadData();
        Point p3 = calc.loadData();
        Point p4 = calc.loadData();
        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);
        calc.showInfoAboutLines(calc.compareLines(line1,line2));
    }
}
