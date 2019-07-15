package com.java.althgriom.nowcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/***
 * Given n points on a 2D plane, find the maximum number of points that lie on the same straight line.
 *
 * 重复的点没有计算
 */

public class MaxPoint {

    public int maxPoints(Point[] points) {
        int max = 0;
        Map<Double, Integer> slopes = new HashMap<>();
        if (points.length == 0) {
            return 0;
        }

        for (int i=0; i<points.length; i++) {
            for (int j=i+1; j<points.length; j++) {
                double slope = slope(points[i], points[j]);

                if (slopes.containsKey(slope)) {
                   int slopeValue = slopes.get(slope);
                   slopeValue += 1;
                   slopes.put(slope, slopeValue);
                } else {
                    slopes.put(slope, 1);
                }
            }
        }

        Set<Double> keys = slopes.keySet();
        for (Double key: keys) {
            if (max < slopes.get(key)) {
                max = slopes.get(key);
            }
        }

        return unitaryQuadraticEquation(max);
    }

    public double slope(Point p1, Point p2) {
        if (p1.x - p2.x == 0) {
            return 0;
        }

        return (Double.valueOf(p1.y) - Double.valueOf(p2.y)) /
                (Double.valueOf(p1.x) - Double.valueOf(p2.x));
    }

    public int unitaryQuadraticEquation(int num) {
        int a = 1;
        int b = -1;
        int c = -2 * num;

        int dlta = b * b - 4 * a * c;
        return (-b + (int)Math.sqrt(dlta))/ 2;

    }


    public static void main(String[] args) {

        MaxPoint mp = new MaxPoint();

        Point a1 = new Point(1, 1);
        Point b1 = new Point(2, 2);
        Point c1 = new Point(1, 1);
        Point[] points1 = {a1, b1, c1};

        System.out.println("first cal: " + mp.maxPoints(points1));

        Point a2 = new Point(1, 1);
        Point b2 = new Point(3, 2);
        Point c2 = new Point(5, 3);
        Point d2 = new Point(4, 1);
        Point e2 = new Point(2, 3);
        Point f2 = new Point(1, 4);
        Point[] points2 = {a2, b2, c2, d2, e2, f2};
        System.out.println("second cal: " + mp.maxPoints(points2));
    }
}
