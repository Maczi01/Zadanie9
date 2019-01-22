public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(3);
        Point p2 = new Point(17);
        Point p3 = new Point(6);
        Point p4 = new Point(14);

        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);

        Calc calc = new Calc();
        calc.compareTwoLines(line1,line2);
    }
}
