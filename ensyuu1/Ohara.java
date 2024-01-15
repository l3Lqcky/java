package ensyuu1;
import java.util.Scanner;

public class Ohara {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");
        System.out.print("お名前を入力してください＞");
        String x = stdIn.nextLine();
        System.out.println("こんにちは" + x + "さん！");
    }
}
