class Leap {

    boolean isLeapYear(int year) {
        boolean yearIsLeap = false;
        if (year % 4 == 0) {
            if ((year % 100 != 0)) {
                yearIsLeap = true;
            }
            if ((year % 100 == 0) && (year % 400 == 0)) {
                yearIsLeap = true;
            }
        }
        return yearIsLeap;
    }

}
