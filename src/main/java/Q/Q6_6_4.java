public class Q6_6_4 {
    public static void main(String[] args) {
        /* 変数と配列の宣言 */
        int[] arrayScore = { 80, 70, 90, 65, 80, 75, 65, 50, 100, 95 };
        int[] arrayFreq = new int[11];
        int idx;

        for (idx = 0; idx <arrayFreq.length ; idx++) {      //配列初期化
            arrayFreq[idx] = 0;
        }
        for (idx = 0; idx <arrayScore.length; idx++) {      //範囲の決定
            int j = arrayScore[idx]/10;                     //位置算出
            arrayFreq[j]++;                                 //度数加算
        }
        for (idx = 0; idx <arrayScore.length ; idx++) {      //表示
            System.out.println((idx * 10) + "点台:" + arrayFreq[idx]);
        }
                                                            //idx使用
        System.out.println((idx = 100) + "点:" + arrayFreq[10]);
    }
}
