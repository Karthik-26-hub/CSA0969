public class EvenLengthWords {
    public static void main(String[] args) {
        String input = "This is a test string with even length words";
                String[] words = input.split(" ");
                System.out.println("Words with even length:");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
 }
}
}