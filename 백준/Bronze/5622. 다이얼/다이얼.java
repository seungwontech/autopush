import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] charArr = sc.next().toCharArray();
        int count = charArr.length;
        for (char c : charArr) {
            String str = String.valueOf(c);
            if (str.equals("A") || str.equals("B") || str.equals("C")) {
                count += 2;
            } else if (str.equals("D") || str.equals("E") || str.equals("F")) {
                count += 3;
            } else if (str.equals("G") || str.equals("H") || str.equals("I")) {
                count += 4;
            } else if (str.equals("J") || str.equals("K") || str.equals("L")) {
                count += 5;
            } else if (str.equals("M") || str.equals("N") || str.equals("O")) {
                count += 6;
            } else if (str.equals("P") || str.equals("Q") || str.equals("R") || str.equals("S")) {
                count += 7;
            } else if (str.equals("T") || str.equals("U") || str.equals("V")) {
                count += 8;
            } else if (str.equals("W") || str.equals("X") || str.equals("Y") || str.equals("Z")) {
                count += 9;
            }
        }
        System.out.println(count);
    }
}
