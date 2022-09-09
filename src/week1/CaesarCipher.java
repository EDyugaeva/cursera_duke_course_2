package week1;

import edu.duke.FileResource;

public class CaesarCipher {
    public static void main(String[] args) {
        System.out.println(encrypt("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 15));
        System.out.println(encryptTwoKeys("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 8, 21));
    }

    public static String encrypt(String input, int key) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetToLowerCase = alphabet.toLowerCase();
        String enc = alphabet.substring(key) + alphabet.substring(0, key);
        String encToLowerCase = enc.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int index = -1;
            if (Character.isLowerCase(ch)) {
                index = alphabetToLowerCase.indexOf(ch);
                if (index != -1) {
                    result.append(encToLowerCase.charAt(index));
                }
            }
            if (Character.isUpperCase(ch)) {
                index = alphabet.indexOf(ch);
                if (index != -1) {
                    result.append(enc.charAt(index));
                }
            }
            if (index == -1) {
                result.append(input.charAt(i));
            } else {
            }
        }
        return result.toString();
    }

    public static String encryptTwoKeys(String input, int key1, int key2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                sb1.append(input.charAt(i));
            }
            else {
                sb2.append(input.charAt(i));
            }
        }
        String result1 = encrypt(sb1.toString(), key1);
        String result2 = encrypt(sb2.toString(), key2);
        StringBuilder newResult = new StringBuilder();
        int n = 0;
        int m = 0;
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                newResult.append(result1.charAt(n));
                n++;
            }
            else {
                newResult.append(result2.charAt(m));
                m++;
            }
        }
        return newResult.toString();
    }


    public static void testCaesar() {
        FileResource fr = new FileResource();
        String message = fr.asString();
        int key = 23;
        String encrypted = encrypt(message, key);
        System.out.println("key is " + key + "\n" + encrypted);


    }


}
