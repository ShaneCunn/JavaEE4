package question1;

import static java.lang.Math.sqrt;
import static java.lang.Math.abs;

//import java.lang.Comparable;

public class Triangle extends GeometricFigure2 {

    private static int numTri = 0;
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {
// if side1, side2 or side3 is less than or equal to zero, then print out a error
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


    public double getSide2() {
        return side2;
    }


    public double getSide3() {
        return side3;
    }


    public double totalLength() {
        // add up and returns the length of the sides in a triangle
        return side1 + side2 + side3;

    }


    @Override
    public double calcArea() {
        double p, area;// declares variables

        p = totalLength() / 2;
//absolute value(abs) is used to used to ensure the number is
// never negative, otherwise it leads Not a Number(NAN) error in java
// when using the square root function,
        area = sqrt(abs((p * (p - side1) * (p - side2) * (p - side3))));
        return area;
    }
// print out the number of triangle object , by increasing the
// numTri variable by 1 each time a object is created
    public void getNumTri() {
        System.out.println("The number of triangle objects is: " + numTri);
    }
//compared if the area of triangle 1 is bigger than triangle and vice versa, by using comparable
    public int compareTo(Triangle T) {
        if (calcArea() > T.calcArea())
            return 1;
        else if (calcArea() < T.calcArea())
            return -1;
        else
            return 0;
    }

}
