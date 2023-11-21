public class Q6_8_2 {
    public static void main(String[] args) {
        /* 変数と配列の宣言 */
        int[][] arrayGoban = {{0,1,1,1,1,1,1,0},           //碁盤データ
                              {0,0,2,2,1,2,0,0},
                              {1,0,2,2,2,2,2,2},
                              {2,1,2,2,1,2,2,0},
                              {2,2,2,1,1,2,2,2},
                              {1,2,2,1,1,2,2,2},
                              {0,0,2,2,1,2,0,0},
                              {0,0,2,2,2,0,0,0}};
        int white = 0;                                      //白カウンタ
        int black = 0;                                      //黒カウンタ
        int stone;                                          //石
        for (int i = 0; i< arrayGoban.length; i++) {
            for (int j = 0; j < arrayGoban[i].length; j++) {
                stone = arrayGoban[i][j];
                if (stone == 1) {                           //石（白）判定
                    white++;
                } else if (stone == 2) {                    //石（黒）判定
                    black++;
                }
            }
        }
        System.out.println("白=" + white);                  //表示
        System.out.println("黒=" + black);
    }
}
