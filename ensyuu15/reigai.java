package ensyuu15;

import java.util.Scanner;

public class reigai {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        try {
            System.out.print("整数1 = ");
            int inputInteger1 = stdIn.nextInt();
            System.out.print("整数2 = ");
            int inputInteger2 = stdIn.nextInt();

            int result = inputInteger1 / inputInteger2;
            System.out.println(inputInteger1 + " / " + inputInteger2 + " = " + (double)result + "\n処理終了");

        } catch (ArithmeticException e) {
            System.err.println("0による割り算です！！\n処理終了");
        } finally {
            stdIn.close();
        }
    }
}
