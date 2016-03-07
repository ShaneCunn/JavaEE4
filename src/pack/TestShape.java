package pack;

public class TestShape {

    public static void main(String[] args) {
        // display();
        System.out.println("test out");
        Triangle triangle1 = new Triangle(3, 3, 3);

        Triangle triangle2 = new Triangle(5, 5, 5);
        // double a, b;

        // a = Triangle.totalLength(3, 3, 3);
        // b = Triangle.calcArea(3, 3, 3);

        System.out.println("this triangle has a length of: " + triangle1.totalLength());
        System.out.println("this triangle has a area of: " + triangle1.calcArea());
        triangle2.getNumTri();

        triangle1.compareTo(triangle2);

        if (triangle1.compareTo(triangle2) == 1) {

            System.out.println("the first triangle is bigger");
        } else {
            System.out.println("the second triangle is bigger");
        }
    }

}
