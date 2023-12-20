public class Line {
    private Point point1;
    private Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public double calculateLength() {
        return Math.sqrt((point1.x - point2.x) * (point1.x - point2.x) + (point1.y - point2.y) * (point1.y - point2.y));
    }

    @Override
    public boolean equals(Object obj) {
        //Check if the objects are the same reference (identical objects)
        if (this == obj) {
            return true;
        }
        Line otherLine = (Line) obj;
        // Check if the endpoints of the lines are equal
        return this.point1.equals(otherLine.point1) && this.point2.equals(otherLine.point2);
    }

    public int compareTo(Line otherLine) {
        double thisLength = calculateLength();
        double otherLength = otherLine.calculateLength();
        return Double.compare(thisLength, otherLength);
    }
}
