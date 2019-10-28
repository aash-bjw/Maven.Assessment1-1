package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        String newStr = str.substring(0,1).toUpperCase() + str.substring(1);
        return newStr;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        int value = str.length();
        String outcome = "";

        for (int i = value - 1; i >= 0; i--) {
            outcome = outcome + str.charAt(i);
        }
        return outcome;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        String revStr = reverse(str);
        String camelStr = camelCase(revStr);

        return camelStr;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        return str.substring(1, str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char x = chars[i];
            if (Character.isUpperCase(x)) {
                chars[i] = Character.toLowerCase(x);
            } else if (Character.isLowerCase(x)) {
                chars[i] = Character.toUpperCase(x);
            }
        }
        return new String(chars);
    }
    
}
