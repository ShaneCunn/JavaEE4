package pack;

import static java.lang.Math.sqrt;
import static java.lang.Math.abs;

import java.lang.Comparable;

public class Triangle extends GeometricFigure2 {

    private static int numTri = 0;
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {

            System.out.println("please enter a number greater than zero");
        } else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            numTri++;
        }
    }

    public double getSide1() {

        return side1;
    }

	/*
     * public void setSide1(double side1) {
	 * 
	 * if (side1 <= 0) {
	 * 
	 * } else this.side1 = side1; }
	 */

    public double getSide2() {
        return side2;
    }

	/*
	 * public void setSide2(double side2) { if (side2 <= 0) {
	 * System.out.println("please enter a number greater than zero"); } else
	 * this.side2 = side2; }
	 */

    public double getSide3() {
        return side3;
    }

	/*
	 * public void setSide3(double side3) { if (side3 <= 0) {
	 * System.out.println("please enter a number greater than zero"); } else
	 * this.side3 = side3; }
	 */

    public double totalLength() {
        return side1 + side2 + side3;

    }

    // double side1, double side2, double side3

    @Override
    public double calcArea() {
        double p, area;
        // s = (side1 + side2 + side3) / 2;
        p = totalLength() / 2;
        area = sqrt(abs((p * (p - side1) * (p - side2) * (p - side3))));
        return area;
    }

    public void getNumTri() {
        System.out.println("this triangle objects is: " + numTri);
    }

    public int compareTo(Triangle T) {
        if (calcArea() > T.calcArea())
            return 1;
        else if (calcArea() < T.calcArea())
            return -1;
        else
            return 0;
    }

}
