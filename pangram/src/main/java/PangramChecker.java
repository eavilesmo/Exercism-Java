public class PangramChecker {

    public boolean isPangram(String input) {
        input = input.toLowerCase();
        boolean inputIsPangram = false;
        String letters = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;
        for (int index = 0; index < letters.length(); index++) {
            if (input.contains(Character.toString(letters.charAt(index)))) {
                count++;
            }
        }
        if (count == 26) {
            inputIsPangram = true;
        }
        return inputIsPangram;
    }
}
