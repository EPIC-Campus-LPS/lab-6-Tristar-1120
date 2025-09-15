package com.parklayout;
import java.io.File;
import java.util.Scanner;

public class ParkArea {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("park.txt"));
        double totalArea = 0.0;

        while (sc.hasNext()) {
            String type = sc.next();
            if (type.equals("campsite")) {
                double radius = sc.nextDouble();
                Campsite c = new Campsite(radius);
                totalArea += c.area();
            } else if (type.equals("trail")) {
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                Trail t = new Trail(length, width);
                totalArea += t.area();
            }
        }
        sc.close();
        System.out.printf("Park Area: %.5f\n", totalArea);
    }
}