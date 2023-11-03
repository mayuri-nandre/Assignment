import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
public static void main(String[] args) {
Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a Roman numeral: ");
    String romanNumeral = scanner.nextLine();
    int result = 0;
    int prevValue = 0;
    for (int i = romanNumeral.length() - 1; i >= 0; i--) {
    char currentChar = romanNumeral.charAt(i);
    int currentValue = romanMap.get(currentChar);
    if (currentValue < prevValue)
    {
    result -= currentValue;
    } else
    {
    result += currentValue;
    }
    prevValue = currentValue;
    }
    System.out.println("The integer value is: " + result);
    }
}
