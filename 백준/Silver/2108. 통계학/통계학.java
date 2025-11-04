import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        System.out.println(Math.round(sum / n));
        System.out.println(arr[arr.length / 2]);
        int currentCount = 0;
        int maxCount = -1;
        int mode = arr[0];
        boolean check = false;
        for(int i = 0; i < n -1; i++) {
            if(arr[i] == arr[i + 1]){
                currentCount++;
            } else {
                currentCount = 0;
            }

            if(currentCount > maxCount){
                maxCount = currentCount;
                mode = arr[i];
                check = true;
            } else if (currentCount == maxCount && check) {
                mode = arr[i];
                check = false;
            }
        }
        System.out.println(mode);
        System.out.println(arr[arr.length - 1] - arr[0]);
    }
}

