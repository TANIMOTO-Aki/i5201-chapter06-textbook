public class Q6_6_1 {
    public static void main(String[] args) {
        int[] arrayScore = { 80, 70, 90, 65, 80, 75, 65, 50, 100, 95 };
        int count = 0;                      //人数集計エリアの宣言と初期化

        /* 人数集計ループ */
        for (int idx = 0; idx < arrayScore.length; idx++) {
            if (80 <= arrayScore[idx]) {
                count += 1;                 //８０点以上のとき人数カウントアップ
            }
        }
        System.out.println(count);
    }
}
