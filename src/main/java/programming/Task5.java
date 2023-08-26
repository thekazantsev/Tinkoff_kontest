package programming;

/**
 * принимать выражения 1+(2*2-3).
 * заканчитваются точкой
 * повторяющиеся символы -+.* вызывают WRONG
 *
 */

import java.util.Scanner;
import java.util.regex.Pattern;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Task5 {
    public static void main(String[] args) {
        String inputLine = new Scanner(System.in).nextLine();

        boolean containsLetters = inputLine.matches(".*[a-zA-Z].*");

        Pattern repeatedPattern = Pattern.compile("([-*/+])\\1");

        boolean hasRepeatingSymbols = repeatedPattern.matcher(inputLine).find();

        if (containsLetters || hasRepeatingSymbols) {
            System.out.println("WRONG");
        } else {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("JavaScript");

            try {
                Object result = engine.eval(inputLine.substring(0, inputLine.length() - 1));
                System.out.println(result);
            } catch (ScriptException e) {
                System.out.println("Invalid expression: " + e.getMessage());
            }
        }
    }
}
