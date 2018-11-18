import org.apache.commons.lang3.math.NumberUtils;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadania {

    public static int smallestNumber(int value_1, int value_2, int value_3) {

        return Math.min((Math.min(value_1, value_2)), value_3);
    }

    public static double averageNumbers(double value_1, double value_2, double value_3) {
        return (value_1 + value_2 + value_3) / 3;
    }

    public static void letterNumbers(String name) {
        for (int i = 0; i < name.length(); i++) {

            System.out.println(i + 1 + ". " + name.charAt(i));
        }

    }

    public static String findMiddleChars(String name) {
        int middleCharts = name.length() / 2;
        if (name.length() % 2 == 0) {
            return name.substring(middleCharts - 1, middleCharts + 1);
        } else {
            return String.valueOf(name.charAt(middleCharts));
        }
    }


    public static int findCharsCount(String name, char findChars) {
        int countChars = 0;

        for (int i = 0; i < name.length(); i++) {
            if (findChars == name.charAt(i)) {
                countChars++;
            }
        }
        return countChars;
//    public static boolean isWhiteSpace(char findChars) {
//    return Character.isWhitespace(findChars);
//    }
    }

    public static int addNumbers(String value) {
        if (verifyItIsDigit(value)) {

            int wynik = 0;
            for (int i = 0; i < value.length(); i++) {
                int nowe = Integer.parseInt(String.valueOf(value.charAt(i)));
                wynik += nowe;
            }
            return wynik;
        } else {
            throw new IllegalArgumentException("given value not supported: " + value);
        }
    }

    public static void halfChristmasTree(int value) {

        for (int i = 0; i < value; i++) {

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.println();
        }
    }


    public static boolean validPassword(String password) {
        if (password.length() < 10) {
            return false;
        }
        if (password == null || password.trim().isEmpty()) {
            System.out.println("Incorrect format of string");

        }
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(password);
        // boolean b = m.matches();
        boolean b = m.find();
        if (b == true) {
            System.out.println("There is a special character in my string ");
            return false;
        } else {
            System.out.println("There is no special char.");
        }


        return true;
    }

    public static int avarrageList(List<Integer> values) {
        // 1 2 3 4 5
        int sum = 0;

//        for (int i = 0; i < values.size(); i++){
//            sum =  (sum + values.get(i));
//        }

        for (Integer s : values) {
            sum = sum + s;
            sum += s;

        }


        return sum / values.size();
    }

    public static boolean verifyItIsDigit(String value) {
        return NumberUtils.isParsable(value);
    }
}