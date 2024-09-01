import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int[] arr = new int[26];
            char[] text = br.readLine().toCharArray();
            for (char c : text) {
                if (c >= 'a' && c <= 'z') {
                    arr[c - 'a']++;
                }
            }
            int max = 0;
            for (int e : arr) {
                if (e > max) {
                    max = e;
                }
            }
            int count = 0;
            int answer = 0;
            for(int j = 0; j < 26; j++) {
                if(arr[j] == max) {
                    count++;
                    answer = j;
                }
            }
            sb.append(count == 1 ? (char)('a'+answer) : "?");
        }
        for (int i = 0; i < sb.length(); i++) {
            System.out.println(sb.charAt(i));
        }
    }
}
