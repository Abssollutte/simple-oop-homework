import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    static void main() {

    }

    public static void printStringReverse(String s) {
        if (s.isBlank()) {
            System.out.println("Wrong string");
        }
//        StringBuilder result = new StringBuilder(s);
//        System.out.println(result.reverse());
        char[] charArray = s.toCharArray();
//        for (int i = 1; i <= charArray.length; i++) {
//            System.out.print(charArray[charArray.length-i]);
//        }
        IntStream.rangeClosed(1, charArray.length)
                .mapToObj(i -> charArray[charArray.length-i])
                .forEach(System.out::print);
    }

    public static void printSubStringReverse(String string, int start, int finish) {

    }

    public static String getWordsReverse(String s) {
        return null;
    }


}
