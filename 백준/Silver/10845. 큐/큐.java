import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String command = sc.next();
            if (command.equals("push")) {
                int value = sc.nextInt();
                queue.add(value);
            } else if(command.equals("pop")){
                if ((queue.isEmpty())) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue.poll());
                }
            } else if(command.equals("size")){
                System.out.println(queue.size());
            } else if(command.equals("empty")){
                System.out.println(queue.isEmpty() ? "1" : "0");
            } else if(command.equals("front")) {
                if(queue.isEmpty()){
                    System.out.println("-1");
                } else {
                    System.out.println(queue.peekFirst());
                }
            } else if (command.equals("back")) {
                if(queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue.peekLast());
                }
            }
        }
        sc.close();
    }
}
