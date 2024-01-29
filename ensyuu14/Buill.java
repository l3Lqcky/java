package ensyuu14;

import java.util.Scanner;

public class Buill {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        Scanner stdIn = new Scanner(System.in);
        System.out.print("文字列を入力：");
        String moziretu = stdIn.nextLine();
        StringBuilder sb = new StringBuilder(moziretu);
        sb.setLength(10);
        String output = sb.toString();
        System.out.println("結果文字列：" + output);  
    }
}
