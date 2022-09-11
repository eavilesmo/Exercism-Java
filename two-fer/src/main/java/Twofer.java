public class Twofer {
    public String twofer(String name) {
        String answer = "";
        if (name == null) {
            answer = "One for you, one for me.";
        } else {
            answer = String.format("One for %s, one for me.", name);
        }
        return answer;
    }
}
