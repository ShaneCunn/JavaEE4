package question1;

import java.text.DecimalFormat;

public class TestShape {

	public static void main(String[] args) {

		System.out.println("test out");
        //creates and add 3 doubles to the triangle object array
		Triangle triangle1 = new Triangle(3, 3, 3);

		Triangle triangle2 = new Triangle(5, 5, 5);

		System.out.println("this triangle has a length of: " + triangle1.totalLength());
        // limits the decimal point to 4 places
        DecimalFormat df = new DecimalFormat("####0.0000");

		// print out the area of the triangle by calling the calArea function
		System.out.println("this triangle has a area of: " + df.format(triangle1.calcArea()));
		triangle2.getNumTri();

		triangle1.compareTo(triangle2);
		// compare the 2 triangles object to see which is bigger
		if (triangle1.compareTo(triangle2) == 1) {

			System.out.println("The first triangle is bigger");
		} else {
			System.out.println("The second triangle is bigger");
		}


	}

}
