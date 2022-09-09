package week1;


public class CaesarBreaker {

    public int[] countLetters(String string) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        string = string.toLowerCase();
        int[] result = new int[alphabet.length()];
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < result.length; j++) {
                if (string.charAt(i) == alphabet.charAt(j)) {
                    result[j] += 1;
                }
            }
        }
            return result;
    }

    public int maxIndex(int[] values) {
        int temp = Integer.MIN_VALUE;
        int result = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > temp) {
                temp = values[i];
                result = i;
            }
        }
        return result;
    }

    public String decrypt() {


        return "";
    }


}
