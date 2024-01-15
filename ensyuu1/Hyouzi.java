package ensyuu1;
import java.util.Scanner;

public class Hyouzi {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");
        System.out.print("文字の入力:");
        String x = stdIn.nextLine();
        System.out.print("整数の入力:");
        int y = stdIn.nextInt();
        System.out.print("少数の入力:");
        float z = stdIn.nextFloat();
        System.out.println("入力された文字 = " + x);
        System.out.println("入力された整数 = " + y);
        System.out.println("入力された少数 = " + z);
    }
}
