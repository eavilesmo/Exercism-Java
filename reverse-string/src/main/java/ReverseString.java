class ReverseString {

    String reverse(String inputString) {
        System.out.println(inputString.length());
        String reverseString = "";
        for (int letter = inputString.length()-1; letter >= 0; letter--) {
          reverseString += inputString.charAt(letter);
        }
        return reverseString;
  }
  
}
