class ResistorColorDuo {
    int value(String[] colors) {
        String valueInString = "";
        for (int index = 0; index < 2; index++) {
            switch (colors[index]) {
                case ("black") -> valueInString += "0";
                case ("brown") -> valueInString += "1";
                case ("red") -> valueInString += "2";
                case ("orange") -> valueInString += "3";
                case ("yellow") -> valueInString += "4";
                case ("green") -> valueInString += "5";
                case ("blue") -> valueInString += "6";
                case ("violet") -> valueInString += "7";
                case ("grey") -> valueInString += "8";
                case ("white") -> valueInString += "9";
            }
        }
        int resistorValue = Integer.parseInt(valueInString);
        return resistorValue;
    }
}
