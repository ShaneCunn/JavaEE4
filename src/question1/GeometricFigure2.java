package question1;

public abstract class GeometricFigure2 {
    private boolean filled;


    public GeometricFigure2() {
        filled = false;

    }

    abstract double calcArea();

    public boolean isFilled() {

        return filled;
    }

    public void display() {

        System.out.println("This is a shape:");
    }


}
