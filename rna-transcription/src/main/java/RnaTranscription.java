class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaStrand = "";
        dnaStrand = dnaStrand.toUpperCase();
        for (int index = 0; index < dnaStrand.length(); index++) {
            if (dnaStrand.charAt(index) == 'G') {
                rnaStrand += 'C';
            } else if (dnaStrand.charAt(index) == 'C') {
                rnaStrand += 'G';
            } else if (dnaStrand.charAt(index) == 'T') {
                rnaStrand += 'A';
            } else if (dnaStrand.charAt(index) == 'A') {
                rnaStrand += 'U';
            }
        }
        return rnaStrand;
    }

}
