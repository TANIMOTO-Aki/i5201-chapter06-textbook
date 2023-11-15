public class Q6_6_2 {
    public static void main(String[] args) {
        /* 変数と配列の宣言と初期化 */ 
        int[] arrayScore = {10, 20, 30, -1 ,10 , -1, 18 };
        int count = 0;                              //人数集計
        int total = 0;                              //点数合計
        double average;                                //平均

        /* 集計ループ */
        for (int i = 0; i < arrayScore.length; i++) {
            if (-1 < arrayScore[i]) {               //欠席者を除いて集計
                total += arrayScore[i];
                count++;
            }
        }
        average = (double)total/count;              //平均算出
        System.out.println("平均=" + average);
    }
}
