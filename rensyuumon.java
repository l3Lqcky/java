    // 構文
    // class クラス名 {
    //     クラスの定義
    // }

public class rensyuumon { //-----クラス-----
    //---------[プロパティ]----------------
    String       Name;        //名前
    int          engine_size;    //排気量                   //1,プロパティを作成

    //-----------[メソッド]----------------
    public void getOn() {                                   //2,メソッドの作成
        System.out.println("誰かが乗りました");
    }

    public void move() {
        //String Name;  ここの Name とプロパティの name は違う　これをローカル変数という　このNameは他のとこで重複も使用もできない
        System.out.println("動き始めます");
    }
}
