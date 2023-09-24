package fi.metropolia.jenkins;

import fi.metropolia.jenkins.calculator.Point;

import java.util.Scanner;

import static fi.metropolia.jenkins.calculator.DistanceCalculator.calculateDistance;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coordinates of the first point:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("Enter the coordinates of the second point:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);

        double distance = calculateDistance(point1, point2);

        System.out.println("The distance between the two points is: " + distance);

        scanner.close();

    }
}