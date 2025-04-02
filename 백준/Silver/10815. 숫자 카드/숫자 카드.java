import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sb.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(sb.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int m = Integer.parseInt(sb.readLine());
        ArrayList<B> b = new ArrayList<>();
        st = new StringTokenizer(sb.readLine());
        for (int i = 0; i < m; i++) {
            int index = i;
            int value = Integer.parseInt(st.nextToken());
            b.add(new B(index, value));
        }
        b.sort(Comparator.comparingInt(o -> o.value));
        int[] temp = new int[m];
        int startIndex = 0;
        for (int i = 0; i < b.size() && startIndex < a.length;) {
            if (b.get(i).value < a[startIndex]) {
                temp[b.get(i).index] = 0;
                i++;
            } else if (b.get(i).value == a[startIndex]) {
                temp[b.get(i).index] = 1;
                i++;
                startIndex++;
            } else {
                startIndex++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}

class B {
    int index;
    int value;

    public B(int index, int value) {
        this.index = index;
        this.value = value;
    }
}