public class Line {

    private Point pStart;
    private Point pEnd;

    public Line(Point pStart, Point pEnd) {
        this.pStart = pStart;
        this.pEnd = pEnd;
    }

    public Point getpStart() {
        return pStart;
    }

    public void setpStart(Point pStart) {
        this.pStart = pStart;
    }

    public Point getpEnd() {
        return pEnd;
    }

    public void setpEnd(Point pEnd) {
        this.pEnd = pEnd;
    }
}
