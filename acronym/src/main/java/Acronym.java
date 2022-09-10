import java.util.ArrayList;

class Acronym {
    String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String[] wordList;
        wordList = phrase.split("[\\- _]");
        String acronym = "";
        for (String word : wordList) {
            for (int index = 0; index < word.length(); index++) {
                if (index == 0) {
                    acronym += word.charAt(index);
                }
            }
        }
        acronym = acronym.toUpperCase();
        return acronym;
    }

}
