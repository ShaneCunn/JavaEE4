package question2;

import java.util.ArrayList;

public class NumList implements Num {

    ArrayList<Num> numArray = new ArrayList<Num>();

    public NumList(double[] b) {
        for (double numDouble : b) {
            numArray.add(new NumDouble(numDouble));

        }
    }

    public NumList(Float[] c) {
        for (Float Numfloat : c) {
            numArray.add(new NumFloat(Numfloat));

        }
    }

    @Override
    public void neg() {
        for (Num i : numArray) {

            i.neg();
        }

    }

    @Override
    public void sqrt() {
        for (Num i : numArray) {

            i.sqrt();
        }
    }

    @Override
    public String asString() {
        for (Num NumArray2 : numArray) {
            System.out.println(NumArray2.asString());

        }

        return numArray.toString();
    }


}
