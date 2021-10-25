import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 */


public class RomanToInteger13 {

    public static void main(String[] args) {
        String one = "III";
        String two = "IV";
        String three = "IX";
        String four = "LVIII";
        String five = "MCMXCIV";

        romanToInt(five);
    }

    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        String[] splitInput = s.split("");
        int proov = 0;
        int holder = map.get(splitInput[0]);
        for (int i = 0; i < splitInput.length; i++) {
            if (holder >= map.get(splitInput[i])) {
                holder = map.get(splitInput[i]);
                proov += holder;
            } else {
                proov += map.get(splitInput[i]) - holder - holder;
            }

        }
        return proov;
    }
}
