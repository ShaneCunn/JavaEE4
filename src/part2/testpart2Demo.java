package part2;

public class testpart2Demo {

    public static void main(String[] args) {

        System.out.println("Part 2 test out\n\n");

        double[] dList = {3.5, 5.6, 7.8};

        NumList outputlist = new NumList(dList);
        System.out.println("Output of array:");
        outputlist.asString();
        System.out.println("\nSquare root output:");

        outputlist.sqrt();
        outputlist.asString();

    }

    // Array<Double> numArray = new Array<Double>();

    // NumDouble.add(10.5);

    // numArray.add(231.4);

}
