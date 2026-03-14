// 三つの変数xとyとzの合計と平均を表示

class text2_2 {

    public static void main(String[] args) {
        int x; // x,y,zを定義
        int y;
        int z;

        x = 11; // x,y,zの初期値を入れ込む
        y = 22;
        z = 33;

        System.out.println("xの値は" + x + "です。");
        System.out.println("yの値は" + y + "です。");
        System.out.println("zの値は" + z + "です。");
        System.out.println("合計は" + (x + y + z) + "です。"); // 合計
        System.out.println("平均は" + (x + y + z) / 3 + "です。"); // 平均
    }
}