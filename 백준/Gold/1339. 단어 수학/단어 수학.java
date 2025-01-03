import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String temp = sc.next();
            for (int j = 0; j < temp.length(); j++) {
                char word = temp.charAt(j);
                arr[word - 'A'] += (int) Math.pow(10, temp.length() - 1 - j);
            }
        }
        Arrays.sort(arr);
        int count = 9;
        int result = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > 0) {
                result += arr[i] * count;
                count--;
            }
            if (count < 0) {
                break;
            }
        }
        System.out.println(result);
    }
}
