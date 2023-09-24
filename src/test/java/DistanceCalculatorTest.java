import fi.metropolia.jenkins.calculator.DistanceCalculator;
import fi.metropolia.jenkins.calculator.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanceCalculatorTest {

    private final double DELTA = 0.001;
    @Test
    public void testCalculateDistancePositive() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);

        double expectedDistance = 5.0;
        double actualDistance = DistanceCalculator.calculateDistance(point1, point2);

        assertEquals(expectedDistance, actualDistance, DELTA);
    }

    @Test
    public void testCalculateDistanceNegative() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(-3, -4);

        double expectedDistance = 5.0;
        double actualDistance = DistanceCalculator.calculateDistance(point1, point2);

        assertEquals(expectedDistance, actualDistance, DELTA);
    }

    @Test
    public void testCalculateDistanceZero() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 0);

        double expectedDistance = 0.0;
        double actualDistance = DistanceCalculator.calculateDistance(point1, point2);

        assertEquals(expectedDistance, actualDistance, DELTA);
    }
}
