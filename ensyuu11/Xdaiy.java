package ensyuu11;

public class Xdaiy {
    


    static int x = 100;
    static int y = 200;
    static int  sum = 0;
    public int getSum(){
    for (int i = x; i <= y; i++) {
         sum += i;
        }
        return sum;
    }



}

/**
 * InnerXdaiy
 */
 class zippo {
    public static void main(String[] args) {
        Xdaiy sum = new Xdaiy();
        System.out.println(Xdaiy.x + "から" +Xdaiy.y + "までの合計値は" + sum.getSum() + "です。");
        
    }
    
}
