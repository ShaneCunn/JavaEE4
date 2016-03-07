package part2;

import java.util.ArrayList;

public class NumList implements Num {

    ArrayList<Num> numArray = new ArrayList<Num>();

    public NumList(double[] b) {
        for (double aB : b) {
            numArray.add(new NumDouble(aB));

        }
    }

    public NumList(Float[] c) {
        for (Float aC : c) {
            numArray.add(new NumFloat(aC));

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
        for (Num aNumArray : numArray) {
            System.out.println(aNumArray.asString());

        }

        return numArray.toString();
    }

	/*public NumList(NumDouble[] a) {

		for (int i = 0; i < a.length; i++) {

			numArray.add(a[i]);
		}
	}

	public NumList(NumFloat[] a) {

		for (int i = 0; i < a.length; i++) {

			numArray.add(a[i]);
		}
	}*/

}
