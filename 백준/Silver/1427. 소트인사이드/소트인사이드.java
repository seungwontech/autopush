import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader brf = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = brf.readLine().toCharArray();

        Arrays.sort(arr);

        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}