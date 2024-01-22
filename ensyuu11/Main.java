package ensyuu11;

class Sum {
    int x, y;

    public Sum(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getSum() {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Sum s = new Sum(100, 200);
        System.out.println("100から200までの合計値は" + s.getSum() + "です。");
    }
}

