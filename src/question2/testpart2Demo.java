package question2;

public class testpart2Demo {

    public static void main(String[] args) {

        System.out.println("Part 2 test out\n");

        double[] dList = {25.5, 125.5, 7.8};

        NumList outputList = new NumList(dList);
        System.out.println("Output of array:");
        outputList.asString();
        System.out.println("\nSquare root output:");

        outputList.sqrt();
        outputList.asString();

    }


}
