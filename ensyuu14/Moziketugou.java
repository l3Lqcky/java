package ensyuu14;

public class Moziketugou {
    public static void main(String[] args) {
        String str1 = "東京都千代田区";
        String str2 = "神田神保町";
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);
        String result = sb.toString();
        System.out.println(result);
    }
}
