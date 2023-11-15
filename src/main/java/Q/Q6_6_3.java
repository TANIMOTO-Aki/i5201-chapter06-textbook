public class Q6_6_3 {
    public static void main(String[] args) {
        /* 変数と配列の宣言と初期化 */
        int[] arrayAdm = { 856, 861, 862, 854, 864, 846, 848 };
        int max = 0;                            //最大値の初期化

        /* 最大値の探索 */
        for (int i = 0; i < arrayAdm.length; i++) {
            if (max < arrayAdm[i]) {
                max = arrayAdm[i];              //最大値の設定
            }
        }
        System.out.println("最大=" + max);
    }
}
