import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader brf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(brf.readLine());
        int[] timeArr = new int[n];
        StringTokenizer st = new StringTokenizer(brf.readLine());
        for (int i = 0; i < n; i++) {
            timeArr[i] = Integer.parseInt(st.nextToken());
        }
        int answer = 0;
        int answerSum = 0;
        Arrays.sort(timeArr);
        for(int i = 0; i < n; i++) {
            answer += timeArr[i];
            answerSum += answer;
        }
        System.out.println(answerSum);
    }
}