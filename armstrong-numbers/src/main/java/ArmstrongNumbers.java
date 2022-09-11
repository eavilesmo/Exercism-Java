class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String numberToCheckToString = String.valueOf(numberToCheck);
        String[] listOfNumbers = numberToCheckToString.split("");
        int count = listOfNumbers.length;
        int result = 0;

        for (String number : listOfNumbers) {
            int stringToNumber = Integer.parseInt(number);
            result += Math.pow(stringToNumber, count);
        }

        return result == numberToCheck;
    }

}
