package fi.metropolia.jenkins.calculator;


public class DistanceCalculator {

    public static double calculateDistance(Point point1, Point point2) {
        double dx = point1.getX() - point2.getX();
        double dy = point1.getY() - point2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
