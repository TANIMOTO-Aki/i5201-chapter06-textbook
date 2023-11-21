public class Q6_8_1 {
    public static void main(String[] args) {
        /* 配列の宣言 */
        int[][] arrayScore = {{95,70,85,85},
                              {90,70,80,90},
                              {90,65,80,80}};
        int[] total = new int[arrayScore.length];

        /* 学生ごとの合計点数の集計 */
        for (int i = 0; i < arrayScore.length; i++) {           //一人ずつ処理
            total[i] = 0;                                       //初期化
            for (int j = 0; j < arrayScore[i].length; j++) {    //点数集計
                total[i] += arrayScore[i][j];
            }
        }
        for (int i = 0; i < total.length; i++) {                //合計表示
            System.out.println(total[i]);
        }
    }
}
