import java.util.ArrayList;

public class NaturalNumber {
    private final int number;

    public NaturalNumber(int inputNumber) {
        this.number = inputNumber;
        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
    }

    public Classification getClassification() {
        int result = calculateFactors();

        if (result == number) {
            return Classification.PERFECT;
        } else if (result > number) {
            return Classification.ABUNDANT;
        } else {
            return Classification.DEFICIENT;
        }
    }

    private int calculateFactors(){
        ArrayList<Integer> listOfFactors = new ArrayList<>();
        for (int index = 1; index < number; index++) {
            if ((number % index) == 0) {
                listOfFactors.add(index);
            }
        }
        int result = 0;
        for (int number : listOfFactors) {
            result += number;
        }
        return result;
    }
}
