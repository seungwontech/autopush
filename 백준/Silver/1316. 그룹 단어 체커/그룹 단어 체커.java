import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int groupCount = 0;
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if (isGroupWord(word)) {
                groupCount++;
            }
        }
        System.out.println(groupCount);
    }

    private static boolean isGroupWord(String word) {
        Set<Character> seen = new HashSet<>();
        char prevChar = word.charAt(0);
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (currentChar != prevChar) {
                if (seen.contains(currentChar)) {
                    return false;
                }
                seen.add(prevChar);
                prevChar = currentChar;
            }
        }

        return true;
    }

}
