class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int count = 0;
        for (int number = 0; number <= input; number++) {
            count += number;
        }
        count = (int) Math.pow(count, 2);

        return count;
    }

    int computeSumOfSquaresTo(int input) {
        int count = 0;
        for (int number = 0; number <= input; number++) {
            int elevatedNumber = (int) Math.pow(number, 2);
            count += elevatedNumber;
        }
        return count;
    }

    int computeDifferenceOfSquares(int input) {
        int resultSquareOfSum = computeSquareOfSumTo(input);
        int resultSumOfSquares = computeSumOfSquaresTo(input);
        return resultSquareOfSum - resultSumOfSquares;
    }
}
