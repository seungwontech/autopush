import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sb.readLine());
        ArrayList<People> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(sb.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            people.add(new People(age, name));
        }
        people.sort((o1, o2) -> o1.age - o2.age);
        for (People person : people) {
            System.out.println(person.age + " " + person.name);
        }
    }
}

class People {
    int age;
    String name;

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
