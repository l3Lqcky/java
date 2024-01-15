package ensyuu1;

import java.util.Scanner;

public class Nengetu {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");
        System.out.print("年:");
        int x = stdIn.nextInt();
        System.out.print("月:");
        int y = stdIn.nextInt();
        System.out.print("日:");
        int z = stdIn.nextInt();
        System.out.println(x + "/" + y + "/" + z);
    }
}
