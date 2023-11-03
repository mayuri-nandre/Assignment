import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray
{
public static void main(String[] args)
{
List<Integer> array = new ArrayList<>();
for (int i = 1; i <= 7; i++)
{
array.add(i);
}
Collections.shuffle(array);
System.out.println("Shuffled Array: " + array);
}
}