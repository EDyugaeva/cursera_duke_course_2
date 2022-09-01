package week1;

public class CaesarCipher {
    public static void main(String[] args) {
    testIsVovel();
    }

    public static boolean isVowel(char ch) {
    String vovel = "aeiou";
    String test = Character.toString(ch).toLowerCase();
        if (vovel.contains(test)) {
            return true;

        }
    return false;
    }

    public static void testIsVovel() {
        System.out.println("a - " + isVowel('a'));
        System.out.println("b - " + isVowel('b'));
        System.out.println("A - " + isVowel('A'));
        System.out.println("1 - " + isVowel('1'));

        System.out.println(replaceVovels("Hello world", '*'));

        System.out.println(emphasize("dna ctgaaactga", 'a'));

    }

    public static String replaceVovels(String phrase, char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            if (isVowel(phrase.charAt(i))) {
                sb.append(ch);
            }
            else {
                sb.append(phrase.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String emphasize(String phrase, char ch) {
        StringBuilder result = new StringBuilder();
        String toUpperCase = phrase.toLowerCase();
        String toLowerCase = phrase.toLowerCase();

        for (int i = 0; i < phrase.length(); i++) {
            if (toUpperCase.charAt(i) == ch || toLowerCase.charAt(i) == ch) {
                if (i % 2 == 0) {
                    result.append('*');
                }
                else {
                    result.append('+');
                }
            }
            else {
                result.append(phrase.charAt(i));
            }
        }
        return result.toString();

    }
}
