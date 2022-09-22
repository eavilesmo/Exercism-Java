class ResistorColor {
    int colorCode(String color) {
        return switch (color) {
            case ("black") -> 0;
            case ("brown") -> 1;
            case ("red") -> 2;
            case ("orange") -> 3;
            case ("yellow") -> 4;
            case ("green") -> 5;
            case ("blue") -> 6;
            case ("violet") -> 7;
            case ("grey") -> 8;
            case ("white") -> 9;
            default -> -1;
        };
    }

    String[] colors() {
        String[] allColors = new String[10];
        allColors[0] = "black";
        allColors[1] = "brown";
        allColors[2] = "red";
        allColors[3] = "orange";
        allColors[4] = "yellow";
        allColors[5] = "green";
        allColors[6] = "blue";
        allColors[7] = "violet";
        allColors[8] = "grey";
        allColors[9] = "white";
        return allColors;
    }
}
