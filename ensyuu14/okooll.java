package ensyuu14;

import java.util.Scanner;

public class okooll {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("文字列を２つ入力してください。");
        System.out.print("1つ目の文字列を入力：");
        String moziretu1 = stdIn.nextLine();
        System.out.print("2つ目の文字列を入力：");
        String moziretu2 = stdIn.nextLine();
        if (moziretu1.equals(moziretu2)) {
            System.out.println("同じ文字列です。");
        } else  {
            System.out.println("違う文字列です。");
        }
    }
}
