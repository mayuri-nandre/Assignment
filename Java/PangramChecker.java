import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker
 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String input = scanner.nextLine().toLowerCase(); 
    boolean isPangram = checkPangram(input);
    if (isPangram)
    {
    System.out.println("The sentence is a pangram.");
    } else 
    {
    System.out.println("The sentence is not a pangram.");
    }
    }
    private static boolean checkPangram(String input)
    {
    Set<Character> alphabetSet = new HashSet<>();
    for (char ch : input.toCharArray())
    {
    if (Character.isLetter(ch)) {
    alphabetSet.add(ch);
    }
    }
    return alphabetSet.size() == 26;
    }
}